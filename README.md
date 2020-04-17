# REST API

## Cadastrar uma pessoa

```txt
POST http://hackathon-sebrae.duckdns.org/pessoas
{
  "nome":"João Silva",
  "email":"joao.silva@example.com",
  "telefone":"+55-71-999999999",
  "empresa":"Example Services",
  "categoriaDaEmpresa":"Serviços",
  "anosDeMercado":8
}
```

## Obter a lista de pessoas cadastradas

```txt
GET http://hackathon-sebrae.duckdns.org/pessoas
```

## Obter o cadastro de uma pessoa

```txt
GET http://hackathon-sebrae.duckdns.org/pessoas/{id}
```

## Remover o cadastro de uma pessoa

```txt
DELETE http://hackathon-sebrae.duckdns.org/pessoas/{id}
```
