# Documentación API
para conectarse con swagger se necesita  "http://localhost:9000/biblioteca"
Serve: `http://localhost:9000/biblioteca
EndPoint: `Corresponde al nombre de cada controller`

CATEGORIA
----------
# Crear resgistros en CATEGORIA en Swagger
para ingresar datos de la Categoira
**Save** POST

```json
{
  "nombre":"Terror",
  "descripcion":"basado en hecho reales",
  "codigoUnico":"n0t2p01",
  "estado":1
} 
```

# Actualizar los resgistros en CATEGORIA por medio del Id(1)
en este caso lo que vamos actulizar es el nombre
**Update** PUT
```json
{
  "state": true,
  "nombre": "Terror en texas",
  "descripcion": "string",
  "codigoUnico": "string"
}
```

# Para visualizar los datos registrados en las tablas CATEGORIA y LIBRO
**GET** Visualizar
como resultado nos arroja este mensaje json
LIBRO
-----
```json
{
"status": true,
"data": {
"id": 1,
"state": true,
"createdAt": "2024-04-18T17:17:03",
"updatedAt": "2024-04-18T17:25:46",
"deletedAt": null,
"titulo": "string",
"autor": "string",
"anioPublicacion": 1975,
"categoriaId": {
"id": 1,
"state": true,
"createdAt": "2024-04-18T16:55:08",
"updatedAt": "2024-04-18T17:05:09",
"deletedAt": null,
"nombre": "Terror en texas",
"descripcion": "string",
"codigoUnico": "string"
}
},
"message": "Registro encontrado"
}
```

CATEGORIA
----------
```json
{
"status": true,
"data": {
"id": 1,
"state": true,
"createdAt": "2024-04-18T16:55:08",
"updatedAt": null,
"deletedAt": null,
"nombre": "Terror",
"descripcion": "casos reales",
"codigoUnico": "NT02JX1"
},
"message": "Registro encontrado"
}
```

LIBRO
-------
# Crear resgistros en LIBRO en Swagger
para ingresar datos de la Categoira
**Save** POST
```json
{
"state": true,
"titulo": "la matanza de texas",
"autor": "Tobe Hooper",
"anioPublicacion": 1974,
"categoriaId": {
"id": 1
}
}
```

# Actualizar los resgistros en LIBRO por medio del Id(1)
en este caso lo que vamos actulizar es el autor
**Update** PUT
```json
{
"state": true,
"titulo": "string",
"autor": "string",
"anioPublicacion": 1975,
"categoriaId": {
"id": 1
}
}
```

# Se elimina el resgistro por medio del ID en ESTUDIANTES
