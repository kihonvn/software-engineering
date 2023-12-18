# Unit Testing

Testing individual components for finding differences between design models and implementations.

## Advantages

- Reduce the scope of the problem
- Easy to locate and correct faults
- Support division of labor

## Actors

- The tested component (aka fixture)
- Test driver: codes will call the tested component (often a test case or test suite)
- Test stub: components that the tested component will calls

The test driver and the test stubs are mock objects.

## Typical steps of a test driver

- Setup: prepare the tested object and its required test stub
- Act: call a method of the tested object
- Verify: assert the actual outcome and the expected one

## See also

- [Software Testing](../README.md)