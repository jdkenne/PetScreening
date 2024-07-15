-- Drop tables if they exist (optional)
DROP TABLE IF EXISTS Pets;
DROP TABLE IF EXISTS Owners;

-- Create Owners table
CREATE TABLE IF NOT EXISTS Owners (
    ID SERIAL PRIMARY KEY,  -- Use SERIAL for auto-incrementing integer ID
    NAME VARCHAR(255) NOT NULL
);

-- Create Pets table with foreign key reference to Owners
CREATE TABLE IF NOT EXISTS Pets (
    ID SERIAL PRIMARY KEY,  -- Use SERIAL for auto-incrementing integer ID
    NAME VARCHAR(255) NOT NULL,
    WEIGHT INT NOT NULL,
    BREED VARCHAR(255),
    VAX VARCHAR(255),
    TRAINING_LVL INT,
    OWNER_ID INT,  -- Column to hold the foreign key reference

    FOREIGN KEY (OWNER_ID) REFERENCES Owners(ID)
);
