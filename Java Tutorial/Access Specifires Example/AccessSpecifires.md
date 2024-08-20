# Example of Access

1. **Access within the same class** (`AccessSpecifiersExample`):

    - All members are accessible.

2. **Access within the same package** (`SubClassSamePackage`):

    - `private`: Not accessible
    - `Default`: Accessible
    - `protected`: Accessible
    - `public`: Accessible

3. **Access from a different package without inheritance** (`DifferentPackageClass`):

    - `private`: Not accessible
    - `Default`: Not accessible
    - `protected`: Not accessible
    - `public`: Accessible

4. **Access from a different package with inheritance** (`SubClassDifferentPackage`):

    - `private`: Not accessible
    - `Default`: Not accessible
    - `protected`: Accessible
    - `public`: Accessible
