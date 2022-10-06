-- Kumar Shanu
-- Date: 06/10/2022


select p.firstName , p.lastName , a.city , a.state
from person as p
left join Address as a 
on p.personId = a.personId