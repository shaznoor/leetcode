Key Points
1.Stream Pipeline Requirements:

    Every stream must have exactly one terminal operation
    Without a terminal operation, the stream won't execute

2.Common Terminal Operations:

    toArray() - converts to array
    collect() - collects to collection
    forEach() - performs action for each element
    reduce() - combines elements

3.Performance Consideration:

    If you only need to print, use forEach directly
    If you need the sorted results for further processing, collect to array/list