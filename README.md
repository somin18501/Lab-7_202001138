# Lab-7_202001138
Based on Testcase Generation and Black/White Testing
## Section A
### Previous Date Problem

**Test Cases**
| Test Case ID | Day | Month | Year | Expected Output |
| -------------|-----|-------|------|-----------------|
| 1 | 15 | 3 | 2010 | 14-3-2010 |
| 2 | 1 | 1 | 1900 | Invalid |
| 3 | 31 | 12 | 2015 | 30-12-2015 |
| 4 | 29 | 2 | 2001 | Invalid |
| 5 | 20 | 15 | 2008 | Invalid |
| 6 | 31 | 12 | 1900 | 30-12-1900 |
| 7 | 29 | 2 | 2012 | 28-2-2012 |
| 8 | 1 | 3 | 2012 | 29-2-2012 | 
| 9 | 30 | 2 | 2004 | Invalid |
| 10 | 31 | 4 | 2014 | Invalid |

**Equivalence Class Partitions** <br/>
Day:
| Partition ID | Range | Status |
|----------------------|-------|--------|
| E1 | 1<=dd<=28 | Valid |
| E2 | dd<1 | Invalid |
| E3 | dd>31 | Invalid |
| E4 | dd=30 | Valid |
| E5 | dd=29 | Valid for leap year |
| E6 | dd=31 | Valid |

Month:
| Partition ID | Range | Status |
|----------------------|-------|--------|
| E7 | 1<=mm<=12 | Valid |
| E8 | mm<1 | Invalid |
| E9 | mm>12 | Invalid |

Year: 
| Partition ID | Range | Status |
|----------------------|-------|--------|
| E10 | 1900 and 2015 | Valid |
| E11 | Less than 1 | Invalid |
| E12 | Greater than 2015 | Invalid |
