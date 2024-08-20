# Git and GitHub Documentation

## Table of Contents

1. [Introduction](#introduction)
2. [Getting Started with Git](#getting-started-with-git)
   - [Installing Git](#installing-git)
   - [Configuring Git](#configuring-git)
3. [Basic Git Commands](#basic-git-commands)
   - [git init](#git-init)
   - [git clone](#git-clone)
   - [git status](#git-status)
   - [git add](#git-add)
   - [git commit](#git-commit)
   - [git push](#git-push)
   - [git pull](#git-pull)
4. [Branching](#branching)
   - [git branch](#git-branch)
   - [git checkout](#git-checkout)
   - [git merge](#git-merge)
   - [git rebase](#git-rebase)
5. [Undoing Changes](#undoing-changes)
   - [git reset](#git-reset)
   - [git revert](#git-revert)
   - [git clean](#git-clean)
6. [Working with GitHub](#working-with-github)
   - [Creating a Repository](#creating-a-repository)
   - [Forking a Repository](#forking-a-repository)
   - [Pull Requests](#pull-requests)
7. [Advanced Git Commands](#advanced-git-commands)
   - [git stash](#git-stash)
   - [git cherry-pick](#git-cherry-pick)
   - [git bisect](#git-bisect)

## Introduction

Git is a distributed version control system that allows developers to track changes in their codebase and collaborate with others. GitHub is a web-based platform that uses Git for version control and provides tools for collaboration.

## Getting Started with Git

### Installing Git

To install Git, visit [Git's official website](https://git-scm.com/) and download the installer for your operating system. Follow the installation instructions provided.

### Configuring Git

After installing Git, configure your username and email:

```sh
git config --global user.name "Your Name"
git config --global user.email "your.email@example.com"
```

## Basic Git Commands

### `git init`

Initializes a new Git repository in the current directory.

```sh
git init
```

### `git clone`

Clones an existing repository into a new directory.

```sh
git clone <repository_url>
```

### `git status`

Displays the state of the working directory and staging area.

```sh
git status
```

### `git add`

Adds changes in the working directory to the staging area.

```sh
git add <file_name>
git add .
```

### `git commit`

Records changes to the repository with a message.

```sh
git commit -m "Commit message"
```

### `git push`

Uploads local repository content to a remote repository.

```sh
git push origin <branch_name>
```

### `git pull`

Fetches and integrates changes from a remote repository to the local repository.

```sh
git pull origin <branch_name>
```

## Branching

### `git branch`

Lists, creates, or deletes branches.

```sh
git branch
git branch <branch_name>
git branch -d <branch_name>
```

### `git checkout`

Switches to another branch or restores working directory files.

```sh
git checkout <branch_name>
git checkout -b <new_branch_name>
```

### `git merge`

Merges changes from one branch into another.

```sh
git merge <branch_name>
```

### `git rebase`

Reapplies commits on top of another base tip.

```sh
git rebase <branch_name>
```

## Undoing Changes

### `git reset`

Resets the current HEAD to a specified state.

```sh
git reset --hard <commit_hash>
git reset --soft <commit_hash>
```

### `git revert`

Creates a new commit that undoes the changes made by a previous commit.

```sh
git revert <commit_hash>
```

### `git clean`

Removes untracked files from the working directory.

```sh
git clean -f
```

## Working with GitHub

### Creating a Repository

1. Go to GitHub and log in.
2. Click on the "New" button to create a new repository.
3. Fill in the repository name, description, and other details.
4. Click "Create repository".

### Forking a Repository

1. Go to the repository you want to fork.
2. Click on the "Fork" button at the top right corner.
3. The forked repository will appear in your GitHub account.

### Pull Requests

1. Create a new branch and make changes.
2. Push the changes to your forked repository.
3. Go to the original repository and click on "New pull request".
4. Compare the changes and submit the pull request.

## Advanced Git Commands

### `git stash`

Temporarily stores changes in the working directory that are not yet ready to be committed.

```sh
git stash
git stash pop
```

### `git cherry-pick`

Applies the changes introduced by some existing commits.

```sh
git cherry-pick <commit_hash>
```

### `git bisect`

Uses binary search to find the commit that introduced a bug.

```sh
git bisect start
git bisect bad
git bisect good <commit_hash>
```
