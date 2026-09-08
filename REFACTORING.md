# Journal de refactoring

| Classe/méthode | Problème observé                     | Refactoring appliqué                                 | Justification                                                                     |
|----------------|--------------------------------------|------------------------------------------------------|-----------------------------------------------------------------------------------|
| customerState  | le customer avait trop de paramètres | mis 3 paramètre de customer dans customerState soit boolean active, boolean suspended, double accountBalance | pour réduire le nombre de paramètre dans l'objet et les regroupé de façon logique |
