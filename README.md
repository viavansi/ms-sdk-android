


<!DOCTYPE html>
<html lang="en" class="">
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# object: http://ogp.me/ns/object# article: http://ogp.me/ns/article# profile: http://ogp.me/ns/profile#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Language" content="en">
    
    
    <title>viafirma-sdk-android/README.md at master · viavansi/viafirma-sdk-android</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub">
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub">
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-114.png">
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114.png">
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-144.png">
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144.png">
    <meta property="fb:app_id" content="1401488693436528">

      <meta content="@github" name="twitter:site" /><meta content="summary" name="twitter:card" /><meta content="viavansi/viafirma-sdk-android" name="twitter:title" /><meta content="viafirma-sdk-android - Android component lib" name="twitter:description" /><meta content="https://avatars3.githubusercontent.com/u/690400?v=3&amp;s=400" name="twitter:image:src" />
      <meta content="GitHub" property="og:site_name" /><meta content="object" property="og:type" /><meta content="https://avatars3.githubusercontent.com/u/690400?v=3&amp;s=400" property="og:image" /><meta content="viavansi/viafirma-sdk-android" property="og:title" /><meta content="https://github.com/viavansi/viafirma-sdk-android" property="og:url" /><meta content="viafirma-sdk-android - Android component lib" property="og:description" />
      <meta name="browser-stats-url" content="https://api.github.com/_private/browser/stats">
    <meta name="browser-errors-url" content="https://api.github.com/_private/browser/errors">
    <link rel="assets" href="https://assets-cdn.github.com/">
    <link rel="web-socket" href="wss://live.github.com/_sockets/MTI5MDA3MzpjYWI2ZDJmYzdmMTQ1M2EzMmYwNmM0ZjcwNzM1NGE5ZDo5YTJhOGI5NGQxNTIyMDgxYTc3ZmM0NmVjYjI3ZWUyMzRmYTJmOTc1YjZlZTYxMTNkNjM5NGNiMGY2ZjcwNzgx--0dbbb387ee4416458c2b6417549c6aa8b1be30c8">
    <meta name="pjax-timeout" content="1000">
    <link rel="sudo-modal" href="/sessions/sudo_modal">

    <meta name="msapplication-TileImage" content="/windows-tile.png">
    <meta name="msapplication-TileColor" content="#ffffff">
    <meta name="selected-link" value="repo_source" data-pjax-transient>
      <meta name="google-analytics" content="UA-3769691-2">

    <meta content="collector.githubapp.com" name="octolytics-host" /><meta content="collector-cdn.github.com" name="octolytics-script-host" /><meta content="github" name="octolytics-app-id" /><meta content="5AA2BDD8:02C9:15730D0D:5551031D" name="octolytics-dimension-request_id" /><meta content="1290073" name="octolytics-actor-id" /><meta content="inyenia" name="octolytics-actor-login" /><meta content="8bb3344df9de7c196287c765edc2394f19ebe9e1a3d8b2279f4d971eb9e35e4d" name="octolytics-actor-hash" />
    <meta content="/private/private/blob/show" name="analytics-location" />
    <meta content="Rails, view, blob#show" name="analytics-event" />
    <meta class="js-ga-set" name="dimension1" content="Logged In">
    <meta class="js-ga-set" name="dimension2" content="Header v3">
    <meta name="is-dotcom" content="true">
    <meta name="hostname" content="github.com">
    <meta name="user-login" content="inyenia">

    
    <link rel="icon" type="image/x-icon" href="https://assets-cdn.github.com/favicon.ico">


    <meta content="authenticity_token" name="csrf-param" />
<meta content="JvYx+9iJ+6ZtwNpjbwxZMl5M0SDQ38mGEYOEKk0jbrDQA91anITapUoLAuhhRy1XGt0DWhboVN7NRg3Cy34ncg==" name="csrf-token" />

    <link href="https://assets-cdn.github.com/assets/github/index-c486157afcc5f58155a921bc675afb08733fbaa8dcf39ac2104d381dd9c82ac2.css" media="all" rel="stylesheet" />
    <link href="https://assets-cdn.github.com/assets/github2/index-26ca3159d96cf926f7d5e7912b781f0d01f4a04ea62184b2edeb65df519b6228.css" media="all" rel="stylesheet" />
    
    


    <meta http-equiv="x-pjax-version" content="893166193c24e2fc3f7cbec4dded08a7">

      
  <meta name="description" content="viafirma-sdk-android - Android component lib">
  <meta name="go-import" content="github.com/viavansi/viafirma-sdk-android git https://github.com/viavansi/viafirma-sdk-android.git">

  <meta content="690400" name="octolytics-dimension-user_id" /><meta content="viavansi" name="octolytics-dimension-user_login" /><meta content="20012800" name="octolytics-dimension-repository_id" /><meta content="viavansi/viafirma-sdk-android" name="octolytics-dimension-repository_nwo" /><meta content="false" name="octolytics-dimension-repository_public" /><meta content="false" name="octolytics-dimension-repository_is_fork" /><meta content="20012800" name="octolytics-dimension-repository_network_root_id" /><meta content="viavansi/viafirma-sdk-android" name="octolytics-dimension-repository_network_root_nwo" />
  <link href="https://github.com/viavansi/viafirma-sdk-android/commits/master.atom?token=ABOvWX_9KYjb6P9hmbuA07xuosEMR7F0ks6zXkOtwA%3D%3D" rel="alternate" title="Recent Commits to viafirma-sdk-android:master" type="application/atom+xml">

  </head>


  <body class="logged_in  env-production macintosh vis-private page-blob">
    <a href="#start-of-content" tabindex="1" class="accessibility-aid js-skip-to-content">Skip to content</a>
    <div class="wrapper">
      
      
      


        <div class="header header-logged-in true" role="banner">
  <div class="container clearfix">

    <a class="header-logo-invertocat" href="https://github.com/" data-hotkey="g d" aria-label="Homepage" data-ga-click="Header, go to dashboard, icon:logo">
  <span class="mega-octicon octicon-mark-github"></span>
</a>


      <div class="site-search repo-scope js-site-search" role="search">
          <form accept-charset="UTF-8" action="/viavansi/viafirma-sdk-android/search" class="js-site-search-form" data-global-search-url="/search" data-repo-search-url="/viavansi/viafirma-sdk-android/search" method="get"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
  <input type="text"
    class="js-site-search-field is-clearable"
    data-hotkey="s"
    name="q"
    placeholder="Search"
    data-global-scope-placeholder="Search GitHub"
    data-repo-scope-placeholder="Search"
    tabindex="1"
    autocapitalize="off">
  <div class="scope-badge">This repository</div>
</form>
      </div>

      <ul class="header-nav left" role="navigation">
          <li class="header-nav-item explore">
            <a class="header-nav-link" href="/explore" data-ga-click="Header, go to explore, text:explore">Explore</a>
          </li>
            <li class="header-nav-item">
              <a class="header-nav-link" href="https://gist.github.com" data-ga-click="Header, go to gist, text:gist">Gist</a>
            </li>
            <li class="header-nav-item">
              <a class="header-nav-link" href="/blog" data-ga-click="Header, go to blog, text:blog">Blog</a>
            </li>
          <li class="header-nav-item">
            <a class="header-nav-link" href="https://help.github.com" data-ga-click="Header, go to help, text:help">Help</a>
          </li>
      </ul>

      
<ul class="header-nav user-nav right" id="user-links">
  <li class="header-nav-item dropdown js-menu-container">
    <a class="header-nav-link name" href="/inyenia" data-ga-click="Header, go to profile, text:username">
      <img alt="@inyenia" class="avatar" data-user="1290073" height="20" src="https://avatars3.githubusercontent.com/u/1290073?v=3&amp;s=40" width="20" />
      <span class="css-truncate">
        <span class="css-truncate-target">inyenia</span>
      </span>
    </a>
  </li>

  <li class="header-nav-item dropdown js-menu-container">
    <a class="header-nav-link js-menu-target tooltipped tooltipped-s" href="/new" aria-label="Create new..." data-ga-click="Header, create new, icon:add">
      <span class="octicon octicon-plus"></span>
      <span class="dropdown-caret"></span>
    </a>

    <div class="dropdown-menu-content js-menu-content">
      <ul class="dropdown-menu">
        
<li>
  <a href="/new" data-ga-click="Header, create new repository, icon:repo"><span class="octicon octicon-repo"></span> New repository</a>
</li>
<li>
  <a href="/organizations/new" data-ga-click="Header, create new organization, icon:organization"><span class="octicon octicon-organization"></span> New organization</a>
</li>
  <li class="dropdown-divider"></li>
  <li class="dropdown-header">
    <span title="viavansi">This organization</span>
  </li>

  <li>
    <a href="/orgs/viavansi/invitations/new" data-ga-click="Header, invite someone, icon:person"><span class="octicon octicon-person"></span> Invite someone</a>
  </li>

  <li>
    <a href="/orgs/viavansi/new-team" data-ga-click="Header, create new team, icon:jersey"><span class="octicon octicon-jersey"></span> New team</a>
  </li>

  <li>
    <a href="/organizations/viavansi/repositories/new" data-ga-click="Header, create new organization repository, icon:repo"><span class="octicon octicon-repo"></span> New repository</a>
  </li>


  <li class="dropdown-divider"></li>
  <li class="dropdown-header">
    <span title="viavansi/viafirma-sdk-android">This repository</span>
  </li>
    <li>
      <a href="/viavansi/viafirma-sdk-android/issues/new" data-ga-click="Header, create new issue, icon:issue"><span class="octicon octicon-issue-opened"></span> New issue</a>
    </li>
    <li>
      <a href="/viavansi/viafirma-sdk-android/settings/collaboration" data-ga-click="Header, create new collaborator, icon:person"><span class="octicon octicon-person"></span> New collaborator</a>
    </li>

      </ul>
    </div>
  </li>

  <li class="header-nav-item">
      <span class="js-socket-channel js-updatable-content"
        data-channel="notification-changed:inyenia"
        data-url="/notifications/header">
      <a href="/notifications" aria-label="You have unread notifications" class="header-nav-link notification-indicator tooltipped tooltipped-s" data-ga-click="Header, go to notifications, icon:unread" data-hotkey="g n">
          <span class="mail-status unread"></span>
          <span class="octicon octicon-inbox"></span>
</a>  </span>

  </li>

  <li class="header-nav-item">
    <a class="header-nav-link tooltipped tooltipped-s" href="/settings/profile" id="account_settings" aria-label="Settings" data-ga-click="Header, go to settings, icon:settings">
      <span class="octicon octicon-gear"></span>
    </a>
  </li>

  <li class="header-nav-item">
    <form accept-charset="UTF-8" action="/logout" class="logout-form" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="uEORPRuccoO3e8YapdTMcVf5daOIeEjar2UyCZuOzyATLi4hglOJ4RWXreuoROzIWwGhT1nujLGF38eU3cnTJw==" /></div>
      <button class="header-nav-link sign-out-button tooltipped tooltipped-s" aria-label="Sign out" data-ga-click="Header, sign out, icon:logout">
        <span class="octicon octicon-sign-out"></span>
      </button>
</form>  </li>

</ul>



    
  </div>
</div>

        

        


      <div id="start-of-content" class="accessibility-aid"></div>
          <div class="site" itemscope itemtype="http://schema.org/WebPage">
    <div id="js-flash-container">
      
    </div>
    <div class="pagehead repohead instapaper_ignore readability-menu">
      <div class="container">
        
<ul class="pagehead-actions">

  <li>
      <form accept-charset="UTF-8" action="/notifications/subscribe" class="js-social-container" data-autosubmit="true" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="C3cURe/rzctgsaAf3kyyeSlj4r7g8eDmyoUy7ZmZvF9qI7pNZJ4Jr3D8ygN2zTvo6sJmxmdxS9aosGvBshlPNg==" /></div>    <input id="repository_id" name="repository_id" type="hidden" value="20012800" />

      <div class="select-menu js-menu-container js-select-menu">
        <a href="/viavansi/viafirma-sdk-android/subscription"
          class="btn btn-sm btn-with-count select-menu-button js-menu-target" role="button" tabindex="0" aria-haspopup="true"
          data-ga-click="Repository, click Watch settings, action:blob#show">
          <span class="js-select-button">
            <span class="octicon octicon-eye"></span>
            Unwatch
          </span>
        </a>
        <a class="social-count js-social-count" href="/viavansi/viafirma-sdk-android/watchers">
          21
        </a>

        <div class="select-menu-modal-holder">
          <div class="select-menu-modal subscription-menu-modal js-menu-content" aria-hidden="true">
            <div class="select-menu-header">
              <span class="select-menu-title">Notifications</span>
              <span class="octicon octicon-x js-menu-close" role="button" aria-label="Close"></span>
            </div>

            <div class="select-menu-list js-navigation-container" role="menu">

              <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
                <span class="select-menu-item-icon octicon octicon-check"></span>
                <div class="select-menu-item-text">
                  <input id="do_included" name="do" type="radio" value="included" />
                  <span class="select-menu-item-heading">Not watching</span>
                  <span class="description">Be notified when participating or @mentioned.</span>
                  <span class="js-select-button-text hidden-select-button-text">
                    <span class="octicon octicon-eye"></span>
                    Watch
                  </span>
                </div>
              </div>

              <div class="select-menu-item js-navigation-item selected" role="menuitem" tabindex="0">
                <span class="select-menu-item-icon octicon octicon octicon-check"></span>
                <div class="select-menu-item-text">
                  <input checked="checked" id="do_subscribed" name="do" type="radio" value="subscribed" />
                  <span class="select-menu-item-heading">Watching</span>
                  <span class="description">Be notified of all conversations.</span>
                  <span class="js-select-button-text hidden-select-button-text">
                    <span class="octicon octicon-eye"></span>
                    Unwatch
                  </span>
                </div>
              </div>

              <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
                <span class="select-menu-item-icon octicon octicon-check"></span>
                <div class="select-menu-item-text">
                  <input id="do_ignore" name="do" type="radio" value="ignore" />
                  <span class="select-menu-item-heading">Ignoring</span>
                  <span class="description">Never be notified.</span>
                  <span class="js-select-button-text hidden-select-button-text">
                    <span class="octicon octicon-mute"></span>
                    Stop ignoring
                  </span>
                </div>
              </div>

            </div>

          </div>
        </div>
      </div>
</form>
  </li>

  <li>
    
  <div class="js-toggler-container js-social-container starring-container ">

    <form accept-charset="UTF-8" action="/viavansi/viafirma-sdk-android/unstar" class="js-toggler-form starred js-unstar-button" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="vEWRSL1Ci+zQdYGnc8U6ZZGDVtGMOfAiElOSd+MhPxQ9sgqJiTyMqognSGkr/UYPc7sHN+8tVTA5koAfCJTt2A==" /></div>
      <button
        class="btn btn-sm btn-with-count js-toggler-target"
        aria-label="Unstar this repository" title="Unstar viavansi/viafirma-sdk-android"
        data-ga-click="Repository, click unstar button, action:blob#show; text:Unstar">
        <span class="octicon octicon-star"></span>
        Unstar
      </button>
        <a class="social-count js-social-count" href="/viavansi/viafirma-sdk-android/stargazers">
          0
        </a>
</form>
    <form accept-charset="UTF-8" action="/viavansi/viafirma-sdk-android/star" class="js-toggler-form unstarred js-star-button" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="UKhqf/A7OE1+1VY1mecKeTO4gFgMB73eXqSNof5DZbuSKjcKgCVPBSnpyo4Wh88zmcICrgoRy+z+V3qipjoBXw==" /></div>
      <button
        class="btn btn-sm btn-with-count js-toggler-target"
        aria-label="Star this repository" title="Star viavansi/viafirma-sdk-android"
        data-ga-click="Repository, click star button, action:blob#show; text:Star">
        <span class="octicon octicon-star"></span>
        Star
      </button>
        <a class="social-count js-social-count" href="/viavansi/viafirma-sdk-android/stargazers">
          0
        </a>
</form>  </div>

  </li>

        <li>
          <a href="#fork-destination-box" class="btn btn-sm btn-with-count"
              title="Fork your own copy of viavansi/viafirma-sdk-android to your account"
              aria-label="Fork your own copy of viavansi/viafirma-sdk-android to your account"
              rel="facebox"
              data-ga-click="Repository, show fork modal, action:blob#show; text:Fork">
            <span class="octicon octicon-repo-forked"></span>
            Fork
          </a>
          <a href="/viavansi/viafirma-sdk-android/network" class="social-count">0</a>

          <div id="fork-destination-box" style="display: none;">
            <h2 class="facebox-header">Where should we fork this repository?</h2>
            <include-fragment src=""
                class="js-fork-select-fragment fork-select-fragment"
                data-url="/viavansi/viafirma-sdk-android/fork?fragment=1">
              <img alt="Loading" height="64" src="https://assets-cdn.github.com/assets/spinners/octocat-spinner-128-338974454bb5c32803e82f601beb051d373744b024fe8742a76009700fd7e033.gif" width="64" />
            </include-fragment>
          </div>
        </li>

</ul>

        <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title private">
          <span class="mega-octicon octicon-lock"></span>
          <span class="author"><a href="/viavansi" class="url fn" itemprop="url" rel="author"><span itemprop="title">viavansi</span></a></span><!--
       --><span class="path-divider">/</span><!--
       --><strong><a href="/viavansi/viafirma-sdk-android" class="js-current-repository" data-pjax="#js-repo-pjax-container">viafirma-sdk-android</a></strong>
            <span class="repo-private-label">private</span>

          <span class="page-context-loader">
            <img alt="" height="16" src="https://assets-cdn.github.com/assets/spinners/octocat-spinner-32-e513294efa576953719e4e2de888dd9cf929b7d62ed8d05f25e731d02452ab6c.gif" width="16" />
          </span>

        </h1>
      </div><!-- /.container -->
    </div><!-- /.repohead -->

    <div class="container">
      <div class="repository-with-sidebar repo-container new-discussion-timeline  ">
        <div class="repository-sidebar clearfix">
            
<nav class="sunken-menu repo-nav js-repo-nav js-sidenav-container-pjax js-octicon-loaders"
     role="navigation"
     data-pjax="#js-repo-pjax-container"
     data-issue-count-url="/viavansi/viafirma-sdk-android/issues/counts">
  <ul class="sunken-menu-group">
    <li class="tooltipped tooltipped-w" aria-label="Code">
      <a href="/viavansi/viafirma-sdk-android" aria-label="Code" class="selected js-selected-navigation-item sunken-menu-item" data-hotkey="g c" data-selected-links="repo_source repo_downloads repo_commits repo_releases repo_tags repo_branches /viavansi/viafirma-sdk-android">
        <span class="octicon octicon-code"></span> <span class="full-word">Code</span>
        <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/assets/spinners/octocat-spinner-32-e513294efa576953719e4e2de888dd9cf929b7d62ed8d05f25e731d02452ab6c.gif" width="16" />
</a>    </li>

      <li class="tooltipped tooltipped-w" aria-label="Issues">
        <a href="/viavansi/viafirma-sdk-android/issues" aria-label="Issues" class="js-selected-navigation-item sunken-menu-item" data-hotkey="g i" data-selected-links="repo_issues repo_labels repo_milestones /viavansi/viafirma-sdk-android/issues">
          <span class="octicon octicon-issue-opened"></span> <span class="full-word">Issues</span>
          <span class="js-issue-replace-counter"></span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/assets/spinners/octocat-spinner-32-e513294efa576953719e4e2de888dd9cf929b7d62ed8d05f25e731d02452ab6c.gif" width="16" />
</a>      </li>

    <li class="tooltipped tooltipped-w" aria-label="Pull requests">
      <a href="/viavansi/viafirma-sdk-android/pulls" aria-label="Pull requests" class="js-selected-navigation-item sunken-menu-item" data-hotkey="g p" data-selected-links="repo_pulls /viavansi/viafirma-sdk-android/pulls">
          <span class="octicon octicon-git-pull-request"></span> <span class="full-word">Pull requests</span>
          <span class="js-pull-replace-counter"></span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/assets/spinners/octocat-spinner-32-e513294efa576953719e4e2de888dd9cf929b7d62ed8d05f25e731d02452ab6c.gif" width="16" />
</a>    </li>

      <li class="tooltipped tooltipped-w" aria-label="Wiki">
        <a href="/viavansi/viafirma-sdk-android/wiki" aria-label="Wiki" class="js-selected-navigation-item sunken-menu-item" data-hotkey="g w" data-selected-links="repo_wiki /viavansi/viafirma-sdk-android/wiki">
          <span class="octicon octicon-book"></span> <span class="full-word">Wiki</span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/assets/spinners/octocat-spinner-32-e513294efa576953719e4e2de888dd9cf929b7d62ed8d05f25e731d02452ab6c.gif" width="16" />
</a>      </li>
  </ul>
  <div class="sunken-menu-separator"></div>
  <ul class="sunken-menu-group">

    <li class="tooltipped tooltipped-w" aria-label="Pulse">
      <a href="/viavansi/viafirma-sdk-android/pulse" aria-label="Pulse" class="js-selected-navigation-item sunken-menu-item" data-selected-links="pulse /viavansi/viafirma-sdk-android/pulse">
        <span class="octicon octicon-pulse"></span> <span class="full-word">Pulse</span>
        <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/assets/spinners/octocat-spinner-32-e513294efa576953719e4e2de888dd9cf929b7d62ed8d05f25e731d02452ab6c.gif" width="16" />
</a>    </li>

    <li class="tooltipped tooltipped-w" aria-label="Graphs">
      <a href="/viavansi/viafirma-sdk-android/graphs" aria-label="Graphs" class="js-selected-navigation-item sunken-menu-item" data-selected-links="repo_graphs repo_contributors /viavansi/viafirma-sdk-android/graphs">
        <span class="octicon octicon-graph"></span> <span class="full-word">Graphs</span>
        <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/assets/spinners/octocat-spinner-32-e513294efa576953719e4e2de888dd9cf929b7d62ed8d05f25e731d02452ab6c.gif" width="16" />
</a>    </li>
  </ul>


    <div class="sunken-menu-separator"></div>
    <ul class="sunken-menu-group">
      <li class="tooltipped tooltipped-w" aria-label="Settings">
        <a href="/viavansi/viafirma-sdk-android/settings" aria-label="Settings" class="js-selected-navigation-item sunken-menu-item" data-selected-links="repo_settings /viavansi/viafirma-sdk-android/settings">
          <span class="octicon octicon-tools"></span> <span class="full-word">Settings</span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/assets/spinners/octocat-spinner-32-e513294efa576953719e4e2de888dd9cf929b7d62ed8d05f25e731d02452ab6c.gif" width="16" />
</a>      </li>
    </ul>
</nav>

              <div class="only-with-full-nav">
                  
<div class="clone-url open"
  data-protocol-type="http"
  data-url="/users/set_protocol?protocol_selector=http&amp;protocol_type=clone">
  <h3><span class="text-emphasized">HTTPS</span> clone URL</h3>
  <div class="input-group js-zeroclipboard-container">
    <input type="text" class="input-mini input-monospace js-url-field js-zeroclipboard-target"
           value="https://github.com/viavansi/viafirma-sdk-android.git" readonly="readonly">
    <span class="input-group-button">
      <button aria-label="Copy to clipboard" class="js-zeroclipboard btn btn-sm zeroclipboard-button tooltipped tooltipped-s" data-copied-hint="Copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>

  
<div class="clone-url "
  data-protocol-type="ssh"
  data-url="/users/set_protocol?protocol_selector=ssh&amp;protocol_type=clone">
  <h3><span class="text-emphasized">SSH</span> clone URL</h3>
  <div class="input-group js-zeroclipboard-container">
    <input type="text" class="input-mini input-monospace js-url-field js-zeroclipboard-target"
           value="git@github.com:viavansi/viafirma-sdk-android.git" readonly="readonly">
    <span class="input-group-button">
      <button aria-label="Copy to clipboard" class="js-zeroclipboard btn btn-sm zeroclipboard-button tooltipped tooltipped-s" data-copied-hint="Copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>

  
<div class="clone-url "
  data-protocol-type="subversion"
  data-url="/users/set_protocol?protocol_selector=subversion&amp;protocol_type=clone">
  <h3><span class="text-emphasized">Subversion</span> checkout URL</h3>
  <div class="input-group js-zeroclipboard-container">
    <input type="text" class="input-mini input-monospace js-url-field js-zeroclipboard-target"
           value="https://github.com/viavansi/viafirma-sdk-android" readonly="readonly">
    <span class="input-group-button">
      <button aria-label="Copy to clipboard" class="js-zeroclipboard btn btn-sm zeroclipboard-button tooltipped tooltipped-s" data-copied-hint="Copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>



<p class="clone-options">You can clone with
  <a href="#" class="js-clone-selector" data-protocol="http">HTTPS</a>, <a href="#" class="js-clone-selector" data-protocol="ssh">SSH</a>, or <a href="#" class="js-clone-selector" data-protocol="subversion">Subversion</a>.
  <a href="https://help.github.com/articles/which-remote-url-should-i-use" class="help tooltipped tooltipped-n" aria-label="Get help on which URL is right for you.">
    <span class="octicon octicon-question"></span>
  </a>
</p>

  <a href="github-mac://openRepo/https://github.com/viavansi/viafirma-sdk-android" class="btn btn-sm sidebar-button" title="Save viavansi/viafirma-sdk-android to your computer and use it in GitHub Desktop." aria-label="Save viavansi/viafirma-sdk-android to your computer and use it in GitHub Desktop.">
    <span class="octicon octicon-device-desktop"></span>
    Clone in Desktop
  </a>



                <a href="/viavansi/viafirma-sdk-android/archive/master.zip"
                   class="btn btn-sm sidebar-button"
                   aria-label="Download the contents of viavansi/viafirma-sdk-android as a zip file"
                   title="Download the contents of viavansi/viafirma-sdk-android as a zip file"
                   rel="nofollow">
                  <span class="octicon octicon-cloud-download"></span>
                  Download ZIP
                </a>
              </div>
        </div><!-- /.repository-sidebar -->

        <div id="js-repo-pjax-container" class="repository-content context-loader-container" data-pjax-container>

          

<a href="/viavansi/viafirma-sdk-android/blob/52d22c7a2155bd683a29276bbbdca58686d4501c/README.md" class="hidden js-permalink-shortcut" data-hotkey="y">Permalink</a>

<!-- blob contrib key: blob_contributors:v21:d94ec96045fb785588f2b230616d3cb9 -->

<div class="file-navigation js-zeroclipboard-container">
  
<div class="select-menu js-menu-container js-select-menu left">
  <span class="btn btn-sm select-menu-button js-menu-target css-truncate" data-hotkey="w"
    data-master-branch="master"
    data-ref="master"
    title="master"
    role="button" aria-label="Switch branches or tags" tabindex="0" aria-haspopup="true">
    <span class="octicon octicon-git-branch"></span>
    <i>branch:</i>
    <span class="js-select-button css-truncate-target">master</span>
  </span>

  <div class="select-menu-modal-holder js-menu-content js-navigation-container" data-pjax aria-hidden="true">

    <div class="select-menu-modal">
      <div class="select-menu-header">
        <span class="select-menu-title">Switch branches/tags</span>
        <span class="octicon octicon-x js-menu-close" role="button" aria-label="Close"></span>
      </div>

      <div class="select-menu-filters">
        <div class="select-menu-text-filter">
          <input type="text" aria-label="Find or create a branch…" id="context-commitish-filter-field" class="js-filterable-field js-navigation-enable" placeholder="Find or create a branch…">
        </div>
        <div class="select-menu-tabs">
          <ul>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="branches" data-filter-placeholder="Find or create a branch…" class="js-select-menu-tab">Branches</a>
            </li>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="tags" data-filter-placeholder="Find a tag…" class="js-select-menu-tab">Tags</a>
            </li>
          </ul>
        </div>
      </div>

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="branches">

        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/viavansi/viafirma-sdk-android/blob/17990_Signature_Algorithm/README.md"
               data-name="17990_Signature_Algorithm"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="17990_Signature_Algorithm">
                17990_Signature_Algorithm
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/viavansi/viafirma-sdk-android/blob/dev/README.md"
               data-name="dev"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="dev">
                dev
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open selected"
               href="/viavansi/viafirma-sdk-android/blob/master/README.md"
               data-name="master"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="master">
                master
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/viavansi/viafirma-sdk-android/blob/sdk_3.8/README.md"
               data-name="sdk_3.8"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="sdk_3.8">
                sdk_3.8
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/viavansi/viafirma-sdk-android/blob/tactivo_mini/README.md"
               data-name="tactivo_mini"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="tactivo_mini">
                tactivo_mini
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/viavansi/viafirma-sdk-android/blob/two-fingerprint/README.md"
               data-name="two-fingerprint"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="two-fingerprint">
                two-fingerprint
              </span>
            </a>
        </div>

          <form accept-charset="UTF-8" action="/viavansi/viafirma-sdk-android/branches" class="js-create-branch select-menu-item select-menu-new-item-form js-navigation-item js-new-item-form" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="WjDJP1HkaeY9nvHoiLRwi6CtEvPm1E8aZKSCbSyQuu7JTIN2JkGBb7HU/UD1ILfcK3p97ebjqsynOKY0jAD+og==" /></div>
            <span class="octicon octicon-git-branch select-menu-item-icon"></span>
            <div class="select-menu-item-text">
              <span class="select-menu-item-heading">Create branch: <span class="js-new-item-name"></span></span>
              <span class="description">from ‘master’</span>
            </div>
            <input type="hidden" name="name" id="name" class="js-new-item-value">
            <input type="hidden" name="branch" id="branch" value="master">
            <input type="hidden" name="path" id="path" value="README.md">
</form>
      </div>

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="tags">
        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/viavansi/viafirma-sdk-android/tree/GooglePlay_3.7/README.md"
                 data-name="GooglePlay_3.7"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="GooglePlay_3.7">GooglePlay_3.7</a>
            </div>
        </div>

        <div class="select-menu-no-results">Nothing to show</div>
      </div>

    </div>
  </div>
</div>

  <div class="btn-group right">
    <a href="/viavansi/viafirma-sdk-android/find/master"
          class="js-show-file-finder btn btn-sm empty-icon tooltipped tooltipped-s"
          data-pjax
          data-hotkey="t"
          aria-label="Quickly jump between files">
      <span class="octicon octicon-list-unordered"></span>
    </a>
    <button aria-label="Copy file path to clipboard" class="js-zeroclipboard btn btn-sm zeroclipboard-button tooltipped tooltipped-s" data-copied-hint="Copied!" type="button"><span class="octicon octicon-clippy"></span></button>
  </div>

  <div class="breadcrumb js-zeroclipboard-target">
    <span class='repo-root js-repo-root'><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/viavansi/viafirma-sdk-android" class="" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">viafirma-sdk-android</span></a></span></span><span class="separator">/</span><strong class="final-path">README.md</strong>
  </div>
</div>

<include-fragment class="commit commit-loader file-history-tease" src="/viavansi/viafirma-sdk-android/contributors/master/README.md">
  <div class="file-history-tease-header">
    Fetching contributors&hellip;
  </div>

  <div class="participation">
    <p class="loader-loading"><img alt="" height="16" src="https://assets-cdn.github.com/assets/spinners/octocat-spinner-32-EAF2F5-0bdc57d34b85c4a4de9d0d1db10cd70e8a95f33ff4f46c5a8c48b4bf4e5a9abe.gif" width="16" /></p>
    <p class="loader-error">Cannot retrieve contributors at this time</p>
  </div>
</include-fragment>
<div class="file">
  <div class="file-header">
    <div class="file-actions">

      <div class="btn-group">
        <a href="/viavansi/viafirma-sdk-android/raw/master/README.md" class="btn btn-sm " id="raw-url">Raw</a>
          <a href="/viavansi/viafirma-sdk-android/blame/master/README.md" class="btn btn-sm js-update-url-with-hash">Blame</a>
        <a href="/viavansi/viafirma-sdk-android/commits/master/README.md" class="btn btn-sm " rel="nofollow">History</a>
      </div>

        <a class="octicon-btn tooltipped tooltipped-nw"
           href="github-mac://openRepo/https://github.com/viavansi/viafirma-sdk-android?branch=master&amp;filepath=README.md"
           aria-label="Open this file in GitHub for Mac"
           data-ga-click="Repository, open with desktop, type:mac">
            <span class="octicon octicon-device-desktop"></span>
        </a>

            <form accept-charset="UTF-8" action="/viavansi/viafirma-sdk-android/edit/master/README.md" class="inline-form" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="C7FiH/pr0HOZmTcTeyqwD9VTZBMjnXVcUJTMBcSSCgdtsIloA/g+djKSM+RGipJTVPJ5aex6gOZ09WgGBmu1JA==" /></div>
              <button class="octicon-btn tooltipped tooltipped-n" type="submit" aria-label="Edit this file" data-hotkey="e" data-disable-with>
                <span class="octicon octicon-pencil"></span>
              </button>
</form>
          <form accept-charset="UTF-8" action="/viavansi/viafirma-sdk-android/delete/master/README.md" class="inline-form" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="IVJn47ALU9JaWWJXIvMMxPR4cr7bs9DqR1AuUDGui1OmA2qcn9chMIOfsBkRx4wHyu5r2C4aSplVlHrveVZpCA==" /></div>
            <button class="octicon-btn octicon-btn-danger tooltipped tooltipped-n" type="submit" aria-label="Delete this file" data-disable-with>
              <span class="octicon octicon-trashcan"></span>
            </button>
</form>    </div>

    <div class="file-info">
        69 lines (50 sloc)
        <span class="file-info-divider"></span>
      2.905 kb
    </div>
  </div>
    <div id="readme" class="blob instapaper_body">
    <article class="markdown-body entry-content" itemprop="mainContentOfPage"><h1>
<a id="user-content-viafirma-android-library" class="anchor" href="#viafirma-android-library" aria-hidden="true"><span class="octicon octicon-link"></span></a>Viafirma Android Library</h1>

<h3>
<a id="user-content-installation-guide-as-an-android-studio-module" class="anchor" href="#installation-guide-as-an-android-studio-module" aria-hidden="true"><span class="octicon octicon-link"></span></a>Installation guide as an Android Studio Module</h3>

<ol>
<li>Download the module <code>ViafirmaAndroidLib</code> from the provided url and copy the path to your local folder.</li>
<li>
<p>Add the following code to the <code>settings.gradle</code> of your project to search for that module on the local path.</p>

<pre><code>include ':viafirma-sdk-android'
project(':viafirma-sdk-android').projectDir = new File(settingsDir, '&lt;path_to&gt;/viafirma-sdk-android')
</code></pre>
</li>
<li>
<p>Add the following code to the <code>build.gradle</code> of your project in order to reference the library.</p>

<pre><code>dependencies {
    compile project(':viafirma-sdk-android')
    ...
}
</code></pre>
</li>
</ol>

<h3>
<a id="user-content-deployment-and-installation-guides-using-maven-local-repository" class="anchor" href="#deployment-and-installation-guides-using-maven-local-repository" aria-hidden="true"><span class="octicon octicon-link"></span></a>Deployment and installation guides using Maven Local Repository</h3>

<ol>
<li>You need <code>viafirma-sdk-android-release.aar</code>:

<ul>
<li>Download it from the provided link, or</li>
<li>Run <code>gradle build</code> from the root of the project library if you have the source, the <code>viafirma-sdk-android-release.aar</code> will be generated in <code>build/outputs/</code> folder.</li>
</ul>
</li>
<li>If necessary, install the latest JDK and set the JAVA_HOME environment.</li>
<li>If necessary, install Maven. You can download it here: <a href="http://maven.apache.org/download.cgi">http://maven.apache.org/download.cgi</a>. Set the MAVEN_HOME environment variable to the path where you extracted maven, and add the maven's bin folder to the PATH environment variable.</li>
<li>
<p>To test that Maven is working fine, open a new console window and run the following:</p>

<pre><code>&gt; mvn -version
</code></pre>
</li>
<li>
<p>Add the aar. library to your local maven repository. Run:</p>

<pre><code>mvn install:install-file -Dfile=&lt;path_to_aar_file&gt; -DgroupId=com.viafirma -DartifactId=viafirmaAndroidLib -Dversion=1.0 -Dpackaging=aar
</code></pre>
</li>
<li>
<p>Add the following code to the <code>build.gradle</code> of the app which will use <em>Viafirma Android Lib</em>:</p>

<pre><code>repositories {
    mavenLocal()
    ...
}
...
dependencies {
    compile 'com.viafirma:viafirmaAndroidLib:1.0'
    ...
}
</code></pre>
</li>
</ol>

<h3>
<a id="user-content-installation-guides-using-maven-remote-repository" class="anchor" href="#installation-guides-using-maven-remote-repository" aria-hidden="true"><span class="octicon octicon-link"></span></a>Installation guides using Maven Remote Repository</h3>

<ol>
<li>
<p>Just modify the <code>build.gradle</code> of your project to include the following code.</p>

<pre><code>repositories {
    maven { url "http://repositorio.viavansi.com/artifactory/libs-releases-local/" }
    ...
}
...
dependencies {
    compile 'com.viafirma:viafirmaAndroidLib:3.7.+'
    ...
}
</code></pre>
</li>
</ol>

<h3>
<a id="user-content-deployment-guide-for-maven-remote-repository" class="anchor" href="#deployment-guide-for-maven-remote-repository" aria-hidden="true"><span class="octicon octicon-link"></span></a>Deployment guide for Maven Remote Repository</h3>

<ol>
<li>If necessary, install Gradle distribution 2.2.1 or upper. You can download it here: <a href="http://www.gradle.org/downloads">http://www.gradle.org/downloads</a>. Set the GRADLE_HOME environment variable to the path where you extracted Gradle, and add the Gradle folder to the PATH environment variable.</li>
<li>
<p>To test that Gradle is working fine, open a new console window and run the following:</p>

<pre><code>&gt; gradle -v
</code></pre>
</li>
<li>
<p>From the command line, in the path where you have the source, run the following command:</p>

<pre><code>&gt; gradle uploadArchives
</code></pre>
</li>
<li>This will generate all the files and upload the AAR to the repository specified on <code>gradle.properties</code>
</li>
<li>You need to specify a new version number every time, the account configured does not have permission to modify/remove uploaded artifacts.</li>
</ol>
</article>
  </div>

</div>

<a href="#jump-to-line" rel="facebox[.linejump]" data-hotkey="l" style="display:none">Jump to Line</a>
<div id="jump-to-line" style="display:none">
  <form accept-charset="UTF-8" action="" class="js-jump-to-line-form" method="get"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
    <input class="linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;" autofocus>
    <button type="submit" class="btn">Go</button>
</form></div>

        </div>

      </div><!-- /.repo-container -->
      <div class="modal-backdrop"></div>
    </div><!-- /.container -->
  </div><!-- /.site -->


    </div><!-- /.wrapper -->

      <div class="container">
  <div class="site-footer" role="contentinfo">
    <ul class="site-footer-links right">
        <li><a href="https://status.github.com/" data-ga-click="Footer, go to status, text:status">Status</a></li>
      <li><a href="https://developer.github.com" data-ga-click="Footer, go to api, text:api">API</a></li>
      <li><a href="https://training.github.com" data-ga-click="Footer, go to training, text:training">Training</a></li>
      <li><a href="https://shop.github.com" data-ga-click="Footer, go to shop, text:shop">Shop</a></li>
        <li><a href="https://github.com/blog" data-ga-click="Footer, go to blog, text:blog">Blog</a></li>
        <li><a href="https://github.com/about" data-ga-click="Footer, go to about, text:about">About</a></li>

    </ul>

    <a href="https://github.com" aria-label="Homepage">
      <span class="mega-octicon octicon-mark-github" title="GitHub"></span>
</a>
    <ul class="site-footer-links">
      <li>&copy; 2015 <span title="0.10950s from github-fe135-cp1-prd.iad.github.net">GitHub</span>, Inc.</li>
        <li><a href="https://github.com/site/terms" data-ga-click="Footer, go to terms, text:terms">Terms</a></li>
        <li><a href="https://github.com/site/privacy" data-ga-click="Footer, go to privacy, text:privacy">Privacy</a></li>
        <li><a href="https://github.com/security" data-ga-click="Footer, go to security, text:security">Security</a></li>
        <li><a href="https://github.com/contact" data-ga-click="Footer, go to contact, text:contact">Contact</a></li>
    </ul>
  </div>
</div>


    <div class="fullscreen-overlay js-fullscreen-overlay" id="fullscreen_overlay">
  <div class="fullscreen-container js-suggester-container">
    <div class="textarea-wrap">
      <textarea name="fullscreen-contents" id="fullscreen-contents" class="fullscreen-contents js-fullscreen-contents" placeholder=""></textarea>
      <div class="suggester-container">
        <div class="suggester fullscreen-suggester js-suggester js-navigation-container"></div>
      </div>
    </div>
  </div>
  <div class="fullscreen-sidebar">
    <a href="#" class="exit-fullscreen js-exit-fullscreen tooltipped tooltipped-w" aria-label="Exit Zen Mode">
      <span class="mega-octicon octicon-screen-normal"></span>
    </a>
    <a href="#" class="theme-switcher js-theme-switcher tooltipped tooltipped-w"
      aria-label="Switch themes">
      <span class="octicon octicon-color-mode"></span>
    </a>
  </div>
</div>



    
    

    <div id="ajax-error-message" class="flash flash-error">
      <span class="octicon octicon-alert"></span>
      <a href="#" class="octicon octicon-x flash-close js-ajax-error-dismiss" aria-label="Dismiss error"></a>
      Something went wrong with that request. Please try again.
    </div>


      <script crossorigin="anonymous" src="https://assets-cdn.github.com/assets/frameworks-06533d99d3f0ca9115a0563dec4017e1bfad7758231e12b95a178cef2cdc3d4c.js"></script>
      <script async="async" crossorigin="anonymous" src="https://assets-cdn.github.com/assets/github/index-59cbed91abaeebed35de0a12f8c3adfea46b14dd56c5019b18a7dcdaf3c88a92.js"></script>
      
      

  </body>
</html>

