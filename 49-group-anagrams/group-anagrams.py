class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res=defaultdict(list)
        for s in strs:
            nums=' '.join(sorted(s))
            res[tuple(sorted(s))].append(s)
        return list(res.values())