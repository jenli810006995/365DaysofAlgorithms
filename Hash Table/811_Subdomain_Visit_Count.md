A website domain like "discuss.leetcode.com" consists of various subdomains. At the top level, we have "com", at the next level, we have "leetcode.com", and at the lowest level, "discuss.leetcode.com". When we visit a domain like "discuss.leetcode.com", we will also visit the parent domains "leetcode.com" and "com" implicitly.

Now, call a "count-paired domain" to be a count (representing the number of visits this domain received), followed by a space, followed by the address. An example of a count-paired domain might be "9001 discuss.leetcode.com".

We are given a list cpdomains of count-paired domains. We would like a list of count-paired domains, (in the same format as the input, and in any order), that explicitly counts the number of visits to each subdomain.

Solution(Python3):
```
class Solution:
    def subdomainVisits(self, cpdomains: List[str]) -> List[str]:
        ans = collections.Counter() # create an empty hash map
        for domain in cpdomains:
            count, domain = domain.split() # split into strings
            count = int(count)
            frags = domain.split('.')
            for i in range(len(frags)):
                ans['.'.join(frags[i:])] += count
                
        return ["{} {}".format(ct, dom) for dom, ct in ans.items()]
            
            
# TC: O(n), n is the length of cpdomain
# SC: O(n)

```
```
Link: https://leetcode.com/problems/subdomain-visit-count/
```
