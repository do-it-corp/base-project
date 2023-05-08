CREATE TABLE user (
    user_id uuid DEFAULT uuid_generate_v4 (),
    name (255) NOT NULL,
    email VARCHAR (255) NOT NULL,
    password VARCHAR (30) NOT NULL
);
