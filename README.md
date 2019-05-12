# grammatical-analysis
a work of grammatical analysis
语法分析的表是用两个HashMap和一个ArrayList组合的
map（HashMap）的形式：
{a=Te, #=@, (=Te, )=@, *=@, +=@}；
wordmap（HashMap）的形式：
{E={a=Te, #=@, (=Te, )=@, *=@, +=@}；
maplist（ArrayList）的形式：
[{E={a=Te, #=@, (=Te, )=@, *=@, +=@}},
 {e={a=@, #=, (=@, )=, *=@, +=+Te}},
{T={a=Ft, #=@, (=Ft, )=@, *=@, +=@}}, 
{t={a=@, #=, (=@, )=, *=*Ft, +=}}, 
{F={a=a, #=@, (=(E), )=@, *=@, +=@}}]
注：
表达式中为空，在表中是“”；
表达式不存在，在表中是“@”。
