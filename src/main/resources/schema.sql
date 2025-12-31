-- schema.sql
-- Tabela principal para armazenar tarefas (To-Do List)

-- Remove a tabela se já existir (apenas para desenvolvimento)

CREATE TABLE tasks (
                       id BIGSERIAL PRIMARY KEY,

                       topic VARCHAR(50) NOT NULL,

                       title VARCHAR(150) NOT NULL,

                       description TEXT,

                       created_date DATE NOT NULL DEFAULT CURRENT_DATE
);
