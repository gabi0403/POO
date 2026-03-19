# 1 - Levantamento de Requisitos

## Requisitos Funcionais (RF)
- RF01 - Controle de Acesso: Autenticação de funcionários via NIF e senha.
- RF02 - Cadastro de Insumos: Registro de materiais com nome, descrição, quantidade e categoria.
- RF03 - Organização por Categorias: Classificação dos itens (Ex: Informática, Elétrica, Limpeza).
- RF04 - Gestão de Ativos: Cadastro e acompanhamento de bens patrimoniais da unidade.
- RF05 - Movimentação: Registro de entradas e saídas de materiais do estoque.

## Requisitos Não Funcionais (RNF)
- RNF01 - Interface Institucional: Layout baseado no Manual de Identidade Visual do SENAI-SP (Cores: #E30613, #FFFFFF, #1F2937).
- RNF02 - Persistência de Dados: Uso de banco de dados relacional com Spring Data JPA.
- RNF03 - Segurança: Validação de acesso via Sessão HTTP (HttpSession).
- RNF04 - Arquitetura: Estrutura dividida em camadas (Model, Repository, Service, Controller).


