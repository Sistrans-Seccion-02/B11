-- Inserta registros en la tabla Usuario RF1
INSERT INTO Usuario (Id) VALUES (1); -- Administrador
INSERT INTO Usuario (Id) VALUES (2); -- Gerente
INSERT INTO Usuario (Id) VALUES (3); -- Empleado
INSERT INTO Usuario (Id) VALUES (4); -- Recepcionista
INSERT INTO Usuario (Id) VALUES (5); -- Cliente

-- Actualizar un usuario existente (por ejemplo, cambiar el id)
UPDATE Usuario
SET Id = 8
WHERE Id = 5;

-- Borrar un usuario existente 
DELETE FROM Usuario
WHERE Id = 8;

-- Consultar informaci�n sobre un usuario espec�fico
SELECT *
FROM Usuario
WHERE Id = 2;

-- Inserta registros en la tabla Personal RF2

INSERT INTO Personal (Id, TipoEmpl, Di, TipoDoc, Nombre, Correo, FKusuario)
VALUES (1, 'Gerente', '123456789', 'CC', 'Nombre Gerente', 'gerente@hotel.com', 2);

INSERT INTO Personal (Id, TipoEmpl, Di, TipoDoc, Nombre, Correo, FKusuario)
VALUES (2, 'Administrador', '987654321', 'CC', 'Nombre Admin', 'admin@hotel.com', 1);

INSERT INTO Personal (Id, TipoEmpl, Di, TipoDoc, Nombre, Correo, FKusuario)
VALUES (3, 'Recepcionista', '11111111', 'CC', 'Nombre Recepcionista1', 'recepcionista1@hotel.com', 4);

INSERT INTO Personal (Id, TipoEmpl, Di, TipoDoc, Nombre, Correo, FKusuario)
VALUES (4, 'Recepcionista', '22222222', 'CC', 'Nombre Recepcionista2', 'recepcionista2@hotel.com', 4);

INSERT INTO Personal (Id, TipoEmpl, Di, TipoDoc, Nombre, Correo, FKusuario)
VALUES (5, 'Empleado', '33333333', 'CC', 'Nombre Empleado1', 'empleado1@hotel.com', 3);

INSERT INTO Personal (Id, TipoEmpl, Di, TipoDoc, Nombre, Correo, FKusuario)
VALUES (6, 'Empleado', '444444444', 'CC', 'Nombre Empleado2', 'empleado2@hotel.com', 3);

-- Actualizar un usuario existente (por ejemplo, cambiar el correo)
UPDATE Personal
SET Correo = 'empleado25@hotel.com'
WHERE Id = 6;

-- Borrar un usuario existente (aseg�rate de que no haya datos asociados)
DELETE FROM Personal
WHERE Id = 4;

-- Consultar informaci�n sobre un usuario espec�fico
SELECT *
FROM Personal
WHERE Id = 2;

-- Insertar un hotel en la tabla Hotel RF3
INSERT INTO Hotel (Id, Nombre, CostoInternet)
VALUES (1, 'Hotel Ejemplo', 50.00);

-- Insertar tipos de habitaciones relacionados con el hotel (utilizando el ID del hotel) RF3 y RF4
INSERT INTO Habitacion (NumHabitacion, TipoHabitacion, Descripcion, Hotel)
VALUES (101, 'SuitPresidencial', 'Habitaci�n de lujo con vista panor�mica', 1);

INSERT INTO Habitacion (NumHabitacion, TipoHabitacion, Descripcion, Hotel)
VALUES (202, 'Suit', 'Suit con jacuzzi', 1);

-- Actualizar un tipo de habitaci�n existente (por ejemplo, cambiar la descripci�n)
UPDATE Habitacion
SET Descripcion = 'Suite ejecutiva con vista panor�mica'
WHERE TipoHabitacion = 'Suit';

-- Borrar un tipo de habitaci�n (aseg�rate de que no haya reservas asociadas)
DELETE FROM Habitacion
WHERE TipoHabitacion = 'SuitPresidencial';

-- Consultar informaci�n sobre un tipo de habitaci�n espec�fico
SELECT *
FROM Habitacion
WHERE TipoHabitacion = 'Suit';

-- Crear una nueva instancia de habitaci�n
INSERT INTO Habitacion (NumHabitacion, TipoHabitacion, Descripcion, Hotel)
VALUES (601, 'SuitPresidencial', 'Suite presidencial con jacuzzi', 1);

-- Actualizar una instancia de habitaci�n existente (por ejemplo, cambiar la descripci�n)
UPDATE Habitacion
SET Descripcion = 'Suite presidencial con vista panor�mica y jacuzzi'
WHERE NumHabitacion = 601;

-- Borrar una instancia de habitaci�n (aseg�rate de que no haya reservas asociadas)
DELETE FROM Habitacion
WHERE NumHabitacion = 601;

-- Consultar informaci�n sobre una instancia de habitaci�n espec�fica
SELECT *
FROM Habitacion
WHERE NumHabitacion = 601;

-- Crear un nuevo servicio del hotel (por ejemplo, piscina) RF5
INSERT INTO ServicioConsumo (Id, Nombre, Capacidad, HorarioApertura, HorarioCierre, Hotel, TipoComida)
VALUES (4, 'Piscina', 50, TIMESTAMP '2023-09-30 09:00:00', TIMESTAMP '2023-09-30 20:00:00', 1, 'No aplicable');

-- Actualizar el horario de apertura y cierre del servicio de la piscina
UPDATE ServicioConsumo
SET HorarioApertura = TIMESTAMP '2023-09-30 10:00:00',
    HorarioCierre = TIMESTAMP '2023-09-30 21:00:00'
WHERE Nombre = 'Piscina';


-- Borrar el servicio de la piscina 
DELETE FROM ServicioConsumo
WHERE Nombre = 'Piscina';

-- Consultar informaci�n sobre el servicio de la piscina
SELECT *
FROM ServicioConsumo
WHERE Nombre = 'Piscina';

-- Crear el servicio "Bar" con ID 3
INSERT INTO ServicioConsumo (Id, Nombre, Capacidad, HorarioApertura, HorarioCierre, Hotel, TipoComida)
VALUES (3, 'Bar', 50, TIMESTAMP '2023-09-30 12:00:00', TIMESTAMP '2023-09-30 23:00:00', 1, 'No aplicable');

-- Agregar productos al men� del Bar (haciendo referencia al servicio "Bar" con ID 3)
INSERT INTO Producto (Nombre, Descripcion, ServicioConsumo, Minibar, Habitacion)
VALUES ('Cerveza', 'Cerveza fr�a', 3, 1, 202);

INSERT INTO Producto (Nombre, Descripcion, ServicioConsumo, Minibar, Habitacion)
VALUES ('C�ctel Margarita', 'C�ctel refrescante con tequila', 3, 2, 101);

INSERT INTO Producto (Nombre, Descripcion, ServicioConsumo, Minibar, Habitacion)
VALUES ('S�ndwich de Club', 'S�ndwich de pollo, tocino y lechuga', 3, 2, 101);

-- Crear un nuevo plan de consumo (por ejemplo, plan "Larga Estad�a") RF6 y RF7
INSERT INTO ReservaHabitacion (Id, CheckIn, CheckOut, NumPersonas, Plan, Habitacion)
VALUES (1, TO_DATE('2023-10-01', 'YYYY-MM-DD'), TO_DATE('2023-11-30', 'YYYY-MM-DD'), 2, 'Particular', 101);

-- Actualizar un plan de consumo existente (por ejemplo, cambiar la fecha de CheckOut)
UPDATE ReservaHabitacion
SET CheckOut = TO_DATE('2023-12-15', 'YYYY-MM-DD')
WHERE Plan = 'Particular';

-- Borrar un plan de consumo 
DELETE FROM ReservaHabitacion
WHERE Plan = 'Particular';

-- Consultar informaci�n sobre un plan de consumo espec�fico (por ejemplo, plan "Larga Estad�a")
SELECT *
FROM ReservaHabitacion
WHERE Plan = 'Particular';

-- Crear una nueva reserva de alojamiento (aseg�rate de que la habitaci�n est� disponible)
INSERT INTO ReservaHabitacion (Id, CheckIn, CheckOut, NumPersonas, Plan, Habitacion)
VALUES (2, TO_DATE('2023-11-01', 'YYYY-MM-DD'), TO_DATE('2023-11-05', 'YYYY-MM-DD'), 2, 'LargaEstadia', 202);

-- Actualizar una reserva de alojamiento existente (por ejemplo, cambiar la fecha de CheckOut)
UPDATE ReservaHabitacion
SET CheckOut = TO_DATE('2023-11-07', 'YYYY-MM-DD')
WHERE Id = 2;

-- Cancelar una reserva de alojamiento (borrar el registro de la reserva)
DELETE FROM ReservaHabitacion
WHERE Id = 2;

-- Consultar informaci�n sobre una reserva de alojamiento espec�fica (por ejemplo, reserva con ID 201)
SELECT *
FROM ReservaHabitacion
WHERE Id = 2;

-- Crear una nueva reserva de un servicio del hotel RF8
INSERT INTO CuentaHabitacion (Id, ReservaHabitacion)
VALUES (301, 1);

-- Inserta un registro en la tabla ServicioLavanderia (por ejemplo) para reservar un servicio
INSERT INTO ServicioLavanderia (Id, Articulo, Costo, Hotel, CuentaHabitacion)
VALUES (401, 'Lavander�a express', 20.00, 1, 301); 

-- Actualizar una reserva de un servicio del hotel existente (por ejemplo, cambiar el art�culo)
UPDATE ServicioLavanderia
SET Articulo = 'Servicio de lavander�a r�pido'
WHERE Id = 401;

-- Cancelar una reserva de un servicio del hotel (borrar el registro del servicio)
DELETE FROM ServicioLavanderia
WHERE Id = 401;

-- Consultar informaci�n sobre una reserva de un servicio del hotel espec�fica (por ejemplo, reserva con ID 401)
SELECT *
FROM ServicioLavanderia
WHERE Id = 401;

-- RF9

INSERT INTO ReservaHabitacion (Id, CheckIn, CheckOut, NumPersonas, Plan, Habitacion, LlegadaCliente, SalidaCliente)
VALUES (1, TO_DATE('2023-09-30',  'YYYY-MM-DD'), TO_DATE('2023-10-05',  'YYYY-MM-DD'), 2, 'TodoIncluido', 123, TO_DATE ('2023-09-30',  'YYYY-MM-DD'), TO_DATE('2023-10-5',  'YYYY-MM-DD'));

UPDATE ReservaHabitacion
SET LlegadaCliente = DATE '2023-10-01'
WHERE Id = 1;

SELECT * FROM ReservaHabitacion WHERE Id = 1;

DELETE FROM ReservaHabitacion WHERE Id = 1;

-- RF10

INSERT INTO Cuenta (Id, Fecha, ServicioConsumo, cargaHabitacion, FechaSalida)
VALUES (1, TO_DATE('2023-09-30', 'YYYY-MM-DD'), 3, 101, TO_DATE('2023-10-05', 'YYYY-MM-DD'));

-- Supongamos que queremos consultar un consumo espec�fico por su ID.
SELECT * FROM Cuenta WHERE Id = 1;

-- Supongamos que deseamos actualizar la fecha del consumo de servicio con ID igual a 1.
UPDATE Cuenta
SET Fecha = TO_DATE('2023-10-01', 'YYYY-MM-DD')
WHERE Id = 1;

-- Supongamos que queremos borrar un consumo de servicio por su ID.
DELETE FROM Cuenta WHERE Id = 1;

-- RF11

INSERT INTO ReservaHabitacion (Id, CheckIn, CheckOut, NumPersonas, Plan, Habitacion, LlegadaCliente, SalidaCliente)
VALUES (1, TO_DATE('2023-10-01',  'YYYY-MM-DD'), TO_DATE('2023-10-10',  'YYYY-MM-DD'), 2, 'LargaEstadia', 101, TO_DATE('2023-10-01', 'YYYY-MM-DD') , TO_DATE('2023-10-10',  'YYYY-MM-DD'));

-- Registrar la salida de un cliente
UPDATE ReservaHabitacion
SET SalidaCliente = '2023-10-01'
WHERE Id = 1;

-- Actualizar la salida de un cliente
UPDATE ReservaHabitacion
SET SalidaCliente = '2023-10-02'
WHERE Id = 1;

-- Borrar la salida de un cliente
UPDATE ReservaHabitacion
SET SalidaCliente = NULL
WHERE Id = 1;

-- Consultar la salida de un cliente
SELECT SalidaCliente
FROM ReservaHabitacion
WHERE Id = 1;









