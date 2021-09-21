Given a text file file.txt, transpose its content.

You may assume that each row has the same number of columns, and each field is separated by the ' ' character.

Example:

If file.txt has the following content:
```
name age
alice 21
ryan 30
```
Output the following:
```
name alice ryan
age 21 30
```
Solution: The for loop in Bash is pretty similar to C
```
awk '{
  for(i=1;i<=NF;i++){
      if (NR==1){
        t[i]=$i # this means if there is only one record, then no transpose needed
      }else{
          t[i] = t[i]" "$i;
      }
  }
 }
END{
  for(i=1;t[i]!="";i++){ # looping when t[i] is not empty
    print t[i];
  }
}' file.txt
```
*NR: refers to "Number of Records"(i.e. current line number). The difference between "NR" and "FNR"(Field Number of Record) is that, "FNR" **resets** for each file read. 
In this question, we only deals with one file, so either one is fine.

*NF: Number of Fields(i.e. number of columns) on an input line.

*$i: the uth field of the input line

*t[i]: The array for saving the transposed table 

[Link](https://leetcode.com/problems/transpose-file/)
