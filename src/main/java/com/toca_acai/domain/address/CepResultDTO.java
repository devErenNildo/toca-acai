package com.toca_acai.domain.address;

public record CepResultDTO(String cep,
                           String logradouro,
                           String complemento,
                           String unidade,
                           String bairro,
                           String localidade,
                           String uf,
                           String ibge,
                           String gia,
                           String ddd,
                           String siafi) {
}

//     "cep": "01001-000",
//             "logradouro": "Praça da Sé",
//             "complemento": "lado ímpar",
//             "unidade": "",
//             "bairro": "Sé",
//             "localidade": "São Paulo",
//             "uf": "SP",
//             "ibge": "3550308",
//             "gia": "1004",
//             "ddd": "11",
//             "siafi": "7107"