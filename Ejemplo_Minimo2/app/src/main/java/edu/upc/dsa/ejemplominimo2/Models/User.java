package edu.upc.dsa.ejemplominimo2.Models;

import java.util.List;

public class User
{
    String login;
    String name;
    String avatar_url;
    int following;
    int public_repos;
    private List<User> userFollowers;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public User()
    {
    };

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public int getPublic_repos() {
        return public_repos;
    }

    public void setPublic_repos(int public_repos) {
        this.public_repos = public_repos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public List<User> getUserFollowers() {
        return userFollowers;
    }

    public void setUserFollowers(List<User> userFollowers) {
        this.userFollowers = userFollowers;
    }
}
