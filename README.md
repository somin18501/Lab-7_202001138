# Lab-7_202001138
Based on Testcase Generation and Black/White Testing
## Section A
### Previous Date Problem

**Test Cases: For Boundary Value Analysis (DD/MM/YYYY)**
| Test Case ID |(DD/MM/YYYY)| Expected Output |
| -------------|-----------------|-----------------|
| 1 | 15/03/2010 | 14/03/2010 |
| 2 | 01/01/1900 | Invalid |
| 3 | 31/12/2015 | 30/12/2015 |
| 4 | 29/02/2001 | Invalid |
| 5 | 29/02/2012 | 28/02/2012 |
| 6 | 31/05/2014 | 30/05/2014 |
| 7 | 31/04/2014 | Invalid |

**Equivalence Class Partitions** <br/>
Day (DD):
| Partition ID | Range | Status |
|----------------------|-------|--------|
| E1 | 1<=DD<=28 | Valid |
| E2 | DD<1 | Invalid |
| E3 | DD>31 | Invalid |
| E4 | DD=30 | Valid |
| E5 | DD=29 | Valid for leap year |
| E6 | DD=31 | Valid |

Month (MM):
| Partition ID | Range | Status |
|----------------------|-------|--------|
| E7 | 1<=MM<=12 | Valid |
| E8 | MM<1 | Invalid |
| E9 | MM>12 | Invalid |

Year (YYYY): 
| Partition ID | Range | Status |
|----------------------|-------|--------|
| E10 | 1900<=YYYY<=2015 | Valid |
| E11 | YYYY<1900 | Invalid |
| E12 | YYYY>2015 | Invalid |

