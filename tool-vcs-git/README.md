该项目主要记录git相关操作命令
git rm和git rm --cached

当我们需要删除暂存区或分支上的文件, 同时工作区也不需要这个文件了, 可以使用

1 git rm file_path
2 git commit -m 'delete somefile'
3 git push
当我们需要删除暂存区或分支上的文件, 但本地又需要使用, 只是不希望这个文件被版本控制, 可以使用

git rm --cached file_path
git commit -m 'delete remote somefile'
git push