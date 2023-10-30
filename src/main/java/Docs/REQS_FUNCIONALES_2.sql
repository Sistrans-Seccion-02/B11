-- RFC1
SELECT numHabitacion, SUM(montoTotal) AS dinero_recolectado
FROM ServicioConsumo
WHERE fechaConsumo BETWEEN TRUNC(SYSDATE) - 365 AND TRUNC(SYSDATE)
GROUP BY numHabitacion
ORDER BY dinero_recolectado DESC;

-- RFC2
SELECT id, COUNT(*) AS cantidad_consumos
FROM ServicioConsumo
GROUP BY id
ORDER BY cantidad_consumos DESC
FETCH FIRST 20 ROWS ONLY;

-- RFC3
SELECT Habitacion, COUNT(*) AS cantidad_reservas
FROM ReservaHabitacion
WHERE CheckIn BETWEEN TRUNC(SYSDATE) - 365 AND TRUNC(SYSDATE)
GROUP BY Habitacion;

-- RFC4
SELECT *
FROM ServicioConsumo
WHERE precio BETWEEN 100 AND 200;

-- RFC5
SELECT *
FROM ServicioConsumo
WHERE cliente = 'ID_DEL_USUARIO' AND fechaConsumo BETWEEN 'FECHA_INICIAL' AND 'FECHA_FINAL';

-- RFC6
-- Fechas de mayor ocupación
SELECT CheckIn, COUNT(*) AS cantidad_reservas
FROM ReservaHabitacion
GROUP BY CheckIn
ORDER BY cantidad_reservas DESC
FETCH FIRST 10 ROWS ONLY;

-- Fechas de mayores ingresos
SELECT fechaConsumo, SUM(montoTotal) AS ingresos
FROM ServicioConsumo
GROUP BY fechaConsumo
ORDER BY ingresos DESC
FETCH FIRST 10 ROWS ONLY;

-- Fechas de menor demanda (menor ocupación)
SELECT CheckIn, COUNT(*) AS cantidad_reservas
FROM ReservaHabitacion
GROUP BY CheckIn
ORDER BY cantidad_reservas ASC
FETCH FIRST 10 ROWS ONLY;

-- RFC7
SELECT cliente
FROM ServicioConsumo
GROUP BY cliente
HAVING SUM(montoTotal) > 15000;

-- RFC8
SELECT id, COUNT(*) AS cantidad_consumos
FROM ServicioConsumo
GROUP BY id
HAVING COUNT(*) < 3 * 52; 

-- RFC9
SELECT cliente, id, fechaConsumo, montoTotal
FROM ServicioConsumo
WHERE id_servicio = 'ID_DEL_SERVICIO' AND fecha_consumo BETWEEN 'FECHA_INICIAL' AND 'FECHA_FINAL';

-- RFC10
SELECT DISTINCT id
FROM Cliente
WHERE id NOT IN (
  SELECT cliente
  FROM ServicioConsumo
  WHERE id = 'ID_DEL_SERVICIO' AND fechaConsumo BETWEEN 'FECHA_INICIAL' AND 'FECHA_FINAL'
);



