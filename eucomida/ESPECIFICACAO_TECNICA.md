# Documento Técnico: Próximos Passos e Justificativas

## Backend

### Adicionar filtros por status de pedidos  
Permite que usuários e entregadores consultem apenas pedidos "Em andamento", "Entregue", etc., melhorando a experiência de uso e a performance das consultas.

### Criar integração com sistema de pagamento  
Essencial para transações reais entre clientes, restaurantes e entregadores. A integração com APIs como Stripe ou MercadoPago permitirá o processamento de pagamentos de forma segura e escalável.

### Implementar notificações de status em tempo real (WebSocket)  
Garante que clientes e entregadores sejam atualizados instantaneamente sobre o status de um pedido. Aumenta a interatividade e confiança no sistema.

---

## Frontend

### Criar telas para login, listagem de restaurantes, carrinho e status de pedido  
São as telas base para a navegação do cliente no sistema. Sem isso, o usuário não consegue autenticar, explorar restaurantes, nem realizar pedidos.

### Consumir APIs com autenticação JWT  
Garante que apenas usuários autenticados possam acessar funcionalidades sensíveis. JWT é leve, escalável e seguro.

---

## Mobile

### Mesmas funcionalidades do frontend adaptadas ao app nativo  
Muitos usuários acessam serviços de entrega via smartphone. Ter as mesmas funcionalidades do web frontend no mobile é essencial para cobertura total da base de usuários.

### Usar push notifications  
Notificações push mantêm os usuários informados sobre mudanças nos pedidos mesmo fora do app, aumentando o engajamento e a eficiência operacional.

---

## Tarefas Técnicas

### Criar entidade Restaurante  
Fundamental para associar pedidos a restaurantes. Permite modelar o cardápio, horários e dados operacionais do restaurante.

### Criar relacionamento Pedido–Usuário–Restaurante  
Estabelece o vínculo lógico entre quem faz o pedido, para quem ele é feito e de onde ele sai. Essencial para integridade de dados e funcionalidades futuras.

### Implementar cadastro de entregadores  
Entregadores são um dos três pilares da aplicação. O sistema precisa conhecê-los para designar pedidos e acompanhar entregas.

### Aplicar testes automatizados (JUnit)  
Garante qualidade, estabilidade e confiança no sistema ao longo do tempo. Permite detectar erros automaticamente a cada mudança no código.

### Criar ambiente de staging com CI/CD  
Permite testar novas versões antes de ir para produção. O CI/CD acelera entregas e reduz falhas com deploys automáticos e reprodutíveis.
