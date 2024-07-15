-- Insert owners into Owners table
INSERT INTO Owners (Name) 
    VALUES ('Josh K'), 
           ('Austin D'),
           ('Cole F'),
           ('Marie R'),
           ('Julia C');

-- Insert pets into Pets table with corresponding owner IDs
INSERT INTO Pets (Name, Weight, Breed, Vax, Training_Lvl, OWNER_ID) 
    VALUES ('Bruce', 2.5, 'Short Hair Tuxedo Cat', 'Fully vaccinated', 3, 1),
           ('Quincy', 6.5, 'Short Hair Black Cat', 'Fully vaccinated', 6, 2),
           ('Billy', 15, 'Pitbull/Terrier Mix', 'Unvaccinated', 8, 3),
           ('Taylor', 20, 'Rottweiler', 'Fully vaccinated', 10, 5),
           ('Sherry', 10, 'Poodle', 'Fully Vaccinated', 7, 4),
           ('Mr. Fluffy', 12, 'Long Hair Tuxedo Cat', 'Unvaccinated', 1, 1);
