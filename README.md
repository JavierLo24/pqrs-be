GESTIÓN DEL PQRS PARA EL PROYECTO DE GESTIÓN DE SEMILLEROS UFPS 2024-1


ENDPOINTS:

CREAR RADICADO PQRS (POST): http://localhost:6060/pqrs/create?tipoPQRSID={ID DEL TIPOPQRS} y como BODY el PQRSDTO

LISTAR RADICADOS PQRS (GET): http://localhost:6060/pqrs

LISTAR RADICADOS POR TIPO (GET): http://localhost:6060/pqrs/tipo y como parámetro el ID del TIPOPQRS

LISTAR RADICADOS POR ESTADO (GET): http://localhost:6060/pqrs/estado y como parámetro el ID del ESTADOPQRS

ELIMINAR RADICADO PQRS (DELETE): http://localhost:6060/pqrs/delete y como parámetro el ID del PQRS

CAMBIAR ESTADO PQRS A REVISION (POST): http://localhost:6060/pqrs/revision y como parámetro el ID del PQRS

CAMBIAR ESTADO PQRS A RESUELTO (POST): http://localhost:6060/pqrs/resuelto y como parámetro el ID del PQRS
