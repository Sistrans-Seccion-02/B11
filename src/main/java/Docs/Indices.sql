-- RFC1
CREATE INDEX idx_money_collected
ON ServicioConsumo (numHabitacion, fechaConsumo);

-- RFC2
CREATE INDEX idx_popular_services
ON ServicioConsumo (id, fechaConsumo);

-- RFC4
CREATE INDEX idx_services_by_price
ON ServicioConsumo (precio);

-- RFC5
CREATE INDEX idx_user_consumption
ON ServicioConsumo (cliente, fechaConsumo);

-- RFC7
CREATE INDEX idx_good_clients
ON ServicioConsumo (cliente, montoTotal);

-- RFC8
CREATE INDEX idx_low_demand_services
ON ServicioConsumo (id);

-- RFC9
CREATE INDEX idx_consumption_query
ON ServicioConsumo (cliente, id, fechaConsumo);

-- RFC10
CREATE INDEX idx_non_consumption_query
ON ServicioConsumo (cliente, id, fechaConsumo);








