-- Tabla Usuario
CREATE TABLE Usuario (
    Id INT PRIMARY KEY
);

-- Tabla Hotel
CREATE TABLE Hotel (
    Id INT PRIMARY KEY,
    Nombre VARCHAR(255) NOT NULL,
    CostoInternet DECIMAL(10, 2)
);

-- Tabla ServicioConsumo
CREATE TABLE ServicioConsumo (
    Id INT PRIMARY KEY,
    Nombre VARCHAR(255) NOT NULL,
    Capacidad INT NOT NULL,
    HorarioApertura TIMESTAMP NOT NULL,
    HorarioCierre TIMESTAMP NOT NULL,
    Hotel INT,
    TipoMusica VARCHAR(255),
    TipoTienda VARCHAR(255),
    TipoComida VARCHAR(255),
    FOREIGN KEY (Hotel) REFERENCES Hotel(Id)
);

-- Tabla Habitacion
CREATE TABLE Habitacion (
    NumHabitacion INT PRIMARY KEY,
    TipoHabitacion VARCHAR(255) CHECK (TipoHabitacion IN ('SuitPresidencial', 'Suit', 'Familiar', 'Doble', 'Sencilla')),
    Descripcion CLOB NOT NULL,
    Hotel INT,
    FOREIGN KEY (Hotel) REFERENCES Hotel(Id)
);

-- Tabla Producto
CREATE TABLE Producto (
    Nombre VARCHAR(255) PRIMARY KEY,
    Descripcion CLOB NOT NULL,
    ServicioConsumo INT,
    Minibar INT,
    FOREIGN KEY (ServicioConsumo) REFERENCES ServicioConsumo(Id),
    Habitacion INT,
    FOREIGN KEY (Habitacion) REFERENCES Habitacion(NumHabitacion)
);

-- Tabla Personal
CREATE TABLE Personal (
    Id INT PRIMARY KEY,
    TipoEmpl VARCHAR(255) CHECK (TipoEmpl IN ('Administrador', 'Gerente', 'Empleado', 'Recepcionista')),
    Di VARCHAR(255),
    TipoDoc VARCHAR(255) CHECK (TipoDoc IN ('TI', 'CC', 'CE', 'P')),
    Nombre VARCHAR(255),
    Correo VARCHAR(255),
    FKusuario INT,
    FOREIGN KEY (FKusuario) REFERENCES Usuario(Id)
);

-- Tabla ReservaHabitacion
CREATE TABLE ReservaHabitacion (
    Id INT PRIMARY KEY,
    CheckIn DATE NOT NULL,
    CheckOut DATE NOT NULL,
    NumPersonas INT NOT NULL,
    Plan VARCHAR(255) CHECK (Plan IN ('LargaEstadia', 'TiempoCompartido', 'TodoIncluido', 'Particular')),
    Habitacion INT,
    FOREIGN KEY (Habitacion) REFERENCES Habitacion(NumHabitacion)
);

-- Tabla CuentaHabitacion
CREATE TABLE CuentaHabitacion (
    Id INT PRIMARY KEY,
    ReservaHabitacion INT,
    FOREIGN KEY (ReservaHabitacion) REFERENCES ReservaHabitacion(Id)
);

-- Tabla ServicioLavanderia
CREATE TABLE ServicioLavanderia (
    Id INT PRIMARY KEY,
    Articulo VARCHAR(255) NOT NULL,
    Costo DECIMAL(10, 2) NOT NULL,
    Hotel INT,
    CuentaHabitacion INT,
    FOREIGN KEY (Hotel) REFERENCES Hotel(Id),
    FOREIGN KEY (CuentaHabitacion) REFERENCES CuentaHabitacion(Id)
);

-- Tabla Cliente
CREATE TABLE Cliente (
    Id INT PRIMARY KEY,
    CuentaGeneral INT,
    FOREIGN KEY (CuentaGeneral) REFERENCES Cuenta(Id)
);

-- Tabla Gimnasio
CREATE TABLE Gimnasio (
    Id INT PRIMARY KEY,
    Capacidad INT NOT NULL,
    Maquinas INT NOT NULL,
    HorarioApertura TIMESTAMP NOT NULL,
    HorarioCierre TIMESTAMP NOT NULL,
    Hotel INT,
    FOREIGN KEY (Hotel) REFERENCES Hotel(Id)
);

-- Tabla Piscina
CREATE TABLE Piscina (
    Id INT PRIMARY KEY,
    Capacidad INT NOT NULL,
    Profundidad INT NOT NULL,
    HorarioApertura TIMESTAMP NOT NULL,
    HorarioCierre TIMESTAMP NOT NULL,
    Hotel INT,
    FOREIGN KEY (Hotel) REFERENCES Hotel(Id)
);

-- Tabla Cuenta
CREATE TABLE Cuenta (
    Id INT PRIMARY KEY,
    Fecha DATE,
    ServicioConsumo INT,
    cargaHabitacion INT,
    FechaSalida DATE,
    FOREIGN KEY (ServicioConsumo) REFERENCES ServicioConsumo(Id),
    FOREIGN KEY (cargaHabitacion) REFERENCES Habitacion(Id)
);


-- Tabla Salon
CREATE TABLE Salon (
    Id INT PRIMARY KEY,
    Capacidad INT NOT NULL,
    TipoSalon VARCHAR(255) CHECK (TipoSalon IN ('Reuniones', 'Conferencias', 'Spa')),
    CostoUsoEqu DECIMAL(10, 2),
    Hotel INT,
    FOREIGN KEY (Hotel) REFERENCES Hotel(Id)
);

-- Tabla Reserva
CREATE TABLE Reserva (
    FechaInicio DATE PRIMARY KEY,
    Duracion INT NOT NULL,
    Costo DECIMAL(10, 2),
    Salon INT,
    Cliente INT,
    cargaHabitacion INT,
    FOREIGN KEY (Salon) REFERENCES Salon(Id),
    FOREIGN KEY (Cliente) REFERENCES Cliente(Id)
);

-- Tabla Utencilio
CREATE TABLE Utencilio (
    Id INT PRIMARY KEY,
    Nombre VARCHAR(255) NOT NULL,
    FechaEntrega DATE NOT NULL,
    FechaDevolucion DATE NOT NULL,
    Costo DECIMAL(10, 2),
    CuentaHabitacion INT,
    FOREIGN KEY (CuentaHabitacion) REFERENCES CuentaHabitacion(Id)
);

-- Creaci�n de la tabla ServicioSpa
CREATE TABLE ServicioSpa (
    NombreServicio VARCHAR(255) PRIMARY KEY,
    Duracion INT NOT NULL,
    Costo DECIMAL(10, 2) NOT NULL,
    Salon INT,
    FOREIGN KEY (Salon) REFERENCES Salon(Id)
);



