  


<!DOCTYPE html>
<html>
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# githubog: http://ogp.me/ns/fb/githubog#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>TSP/README.md at master · Glank/TSP</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub" />
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub" />
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-144.png" />
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144.png" />
    <link rel="logo" type="image/svg" href="http://github-media-downloads.s3.amazonaws.com/github-logo.svg" />
    <meta name="msapplication-TileImage" content="/windows-tile.png">
    <meta name="msapplication-TileColor" content="#ffffff">

    
    
    <link rel="icon" type="image/x-icon" href="/favicon.ico" />

    <meta content="authenticity_token" name="csrf-param" />
<meta content="E5aRcgHhmj8pv12bkpxGKQRCvWaCC1yNDXHyS2uvQBU=" name="csrf-token" />

    <link href="https://a248.e.akamai.net/assets.github.com/assets/github-51d2d4593ac3448a3ccd372edd9a7eeaac7c7f7d.css" media="screen" rel="stylesheet" type="text/css" />
    <link href="https://a248.e.akamai.net/assets.github.com/assets/github2-5fee4310cb7130fe9656cf64857b2fa600fbabd7.css" media="screen" rel="stylesheet" type="text/css" />
    


      <script src="https://a248.e.akamai.net/assets.github.com/assets/frameworks-ad1b87fda705d87118448f87fb6a20bdb15bd841.js" type="text/javascript"></script>
      <script src="https://a248.e.akamai.net/assets.github.com/assets/github-3a6fac8029cd81a166ea0548ce145459eb6c5c15.js" type="text/javascript"></script>
      
      <meta http-equiv="x-pjax-version" content="ca46cc9e6edebdc38aeb71bf09f442a8">

        <link data-pjax-transient rel='permalink' href='/Glank/TSP/blob/739635ae1b4dc584c4298b0e4a7fc752efc7eeff/README.md'>
    <meta property="og:title" content="TSP"/>
    <meta property="og:type" content="githubog:gitrepository"/>
    <meta property="og:url" content="https://github.com/Glank/TSP"/>
    <meta property="og:image" content="https://secure.gravatar.com/avatar/e22aae4c1a688dafca51c985a4890c0b?s=420&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png"/>
    <meta property="og:site_name" content="GitHub"/>
    <meta property="og:description" content="TSP. Contribute to TSP development by creating an account on GitHub."/>
    <meta property="twitter:card" content="summary"/>
    <meta property="twitter:site" content="@GitHub">
    <meta property="twitter:title" content="Glank/TSP"/>

    <meta name="description" content="TSP. Contribute to TSP development by creating an account on GitHub." />

  <link href="https://github.com/Glank/TSP/commits/master.atom" rel="alternate" title="Recent Commits to TSP:master" type="application/atom+xml" />

  </head>


  <body class="logged_in page-blob linux vis-public env-production  ">
    <div id="wrapper">

      

      

      

      


        <div class="header header-logged-in true">
          <div class="container clearfix">

            <a class="header-logo-blacktocat" href="https://github.com/">
  <span class="mega-icon mega-icon-blacktocat"></span>
</a>

            <div class="divider-vertical"></div>

              <a href="/notifications" class="notification-indicator tooltipped downwards" title="You have no unread notifications">
    <span class="mail-status all-read"></span>
  </a>
  <div class="divider-vertical"></div>


              <div class="command-bar js-command-bar  ">
      <form accept-charset="UTF-8" action="/search" class="command-bar-form" id="top_search_form" method="get">
  <a href="/search/advanced" class="advanced-search-icon tooltipped downwards command-bar-search" id="advanced_search" title="Advanced search"><span class="mini-icon mini-icon-advanced-search "></span></a>

  <input type="text" name="q" id="js-command-bar-field" placeholder="Search or type a command" tabindex="1" data-username="Glank" autocapitalize="off">

  <span class="mini-icon help tooltipped downwards" title="Show command bar help">
    <span class="mini-icon mini-icon-help"></span>
  </span>

  <input type="hidden" name="ref" value="commandbar">

  <div class="divider-vertical"></div>
</form>
  <ul class="top-nav">
      <li class="explore"><a href="https://github.com/explore">Explore</a></li>
      <li><a href="https://gist.github.com">Gist</a></li>
      <li><a href="/blog">Blog</a></li>
    <li><a href="http://help.github.com">Help</a></li>
  </ul>
</div>


            

  
    <ul id="user-links">
      <li>
        <a href="https://github.com/Glank" class="name">
          <img height="20" src="https://secure.gravatar.com/avatar/e22aae4c1a688dafca51c985a4890c0b?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png" width="20" /> Glank
        </a>
      </li>
      <li>
        <a href="/new" id="new_repo" class="tooltipped downwards" title="Create a new repo">
          <span class="mini-icon mini-icon-create"></span>
        </a>
      </li>
      <li>
        <a href="/settings/profile" id="account_settings"
          class="tooltipped downwards"
          title="Account settings ">
          <span class="mini-icon mini-icon-account-settings"></span>
        </a>
      </li>
      <li>
        <a href="/logout" data-method="post" id="logout" class="tooltipped downwards" title="Sign out">
          <span class="mini-icon mini-icon-logout"></span>
        </a>
      </li>
    </ul>



            
          </div>
        </div>


      

      


            <div class="site hfeed" itemscope itemtype="http://schema.org/WebPage">
      <div class="hentry">
        
        <div class="pagehead repohead instapaper_ignore readability-menu ">
          <div class="container">
            <div class="title-actions-bar">
              


<ul class="pagehead-actions">

    <li class="nspr">
      <a href="/Glank/TSP/pull/new/master" class="button minibutton btn-pull-request" icon_class="mini-icon-pull-request"><span class="mini-icon mini-icon-pull-request"></span>Pull Request</a>
    </li>

    <li class="subscription">
      <form accept-charset="UTF-8" action="/notifications/subscribe" data-autosubmit="true" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="authenticity_token" type="hidden" value="E5aRcgHhmj8pv12bkpxGKQRCvWaCC1yNDXHyS2uvQBU=" /></div>  <input id="repository_id" name="repository_id" type="hidden" value="7825440" />

    <div class="select-menu js-menu-container js-select-menu">
      <span class="minibutton select-menu-button js-menu-target">
        <span class="js-select-button">
          <span class="mini-icon mini-icon-unwatch"></span>
          Unwatch
        </span>
      </span>

      <div class="select-menu-modal-holder js-menu-content">
        <div class="select-menu-modal">
          <div class="select-menu-header">
            <span class="select-menu-title">Notification status</span>
            <span class="mini-icon mini-icon-remove-close js-menu-close"></span>
          </div> <!-- /.select-menu-header -->

          <div class="select-menu-list js-navigation-container js-select-menu-pane">

            <div class="select-menu-item js-navigation-item js-navigation-target ">
              <span class="select-menu-item-icon mini-icon mini-icon-confirm"></span>
              <div class="select-menu-item-text">
                <input id="do_included" name="do" type="radio" value="included" />
                <h4>Not watching</h4>
                <span class="description">You only receive notifications for discussions in which you participate or are @mentioned.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="mini-icon mini-icon-watching"></span>
                  Watch
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

            <div class="select-menu-item js-navigation-item js-navigation-target selected">
              <span class="select-menu-item-icon mini-icon mini-icon-confirm"></span>
              <div class="select-menu-item-text">
                <input checked="checked" id="do_subscribed" name="do" type="radio" value="subscribed" />
                <h4>Watching</h4>
                <span class="description">You receive notifications for all discussions in this repository.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="mini-icon mini-icon-unwatch"></span>
                  Unwatch
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

            <div class="select-menu-item js-navigation-item js-navigation-target ">
              <span class="select-menu-item-icon mini-icon mini-icon-confirm"></span>
              <div class="select-menu-item-text">
                <input id="do_ignore" name="do" type="radio" value="ignore" />
                <h4>Ignoring</h4>
                <span class="description">You do not receive any notifications for discussions in this repository.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="mini-icon mini-icon-mute"></span>
                  Stop ignoring
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

          </div> <!-- /.select-menu-list -->

        </div> <!-- /.select-menu-modal -->
      </div> <!-- /.select-menu-modal-holder -->
    </div> <!-- /.select-menu -->

</form>
    </li>

    <li class="js-toggler-container js-social-container starring-container ">
      <a href="/Glank/TSP/unstar" class="minibutton js-toggler-target star-button starred upwards" title="Unstar this repo" data-remote="true" data-method="post" rel="nofollow">
        <span class="mini-icon mini-icon-remove-star"></span>
        <span class="text">Unstar</span>
      </a>
      <a href="/Glank/TSP/star" class="minibutton js-toggler-target star-button unstarred upwards" title="Star this repo" data-remote="true" data-method="post" rel="nofollow">
        <span class="mini-icon mini-icon-star"></span>
        <span class="text">Star</span>
      </a>
      <a class="social-count js-social-count" href="/Glank/TSP/stargazers">0</a>
    </li>

        <li>
          <a href="/Glank/TSP/fork" class="minibutton js-toggler-target fork-button lighter upwards" title="Fork this repo" rel="nofollow" data-method="post">
            <span class="mini-icon mini-icon-branch-create"></span>
            <span class="text">Fork</span>
          </a>
          <a href="/Glank/TSP/network" class="social-count">0</a>
        </li>


</ul>

              <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title public">
                <span class="repo-label"><span>public</span></span>
                <span class="mega-icon mega-icon-public-repo"></span>
                <span class="author vcard">
                  <a href="/Glank" class="url fn" itemprop="url" rel="author">
                  <span itemprop="title">Glank</span>
                  </a></span> /
                <strong><a href="/Glank/TSP" class="js-current-repository">TSP</a></strong>
              </h1>
            </div>

            
  <ul class="tabs">
    <li><a href="/Glank/TSP" class="selected" highlight="repo_source repo_downloads repo_commits repo_tags repo_branches">Code</a></li>
    <li><a href="/Glank/TSP/network" highlight="repo_network">Network</a></li>
    <li><a href="/Glank/TSP/pulls" highlight="repo_pulls">Pull Requests <span class='counter'>0</span></a></li>

      <li><a href="/Glank/TSP/issues" highlight="repo_issues">Issues <span class='counter'>0</span></a></li>

      <li><a href="/Glank/TSP/wiki" highlight="repo_wiki">Wiki</a></li>


    <li><a href="/Glank/TSP/graphs" highlight="repo_graphs repo_contributors">Graphs</a></li>

      <li>
        <a href="/Glank/TSP/settings">Settings</a>
      </li>

  </ul>
  
<div class="tabnav">

  <span class="tabnav-right">
    <ul class="tabnav-tabs">
          <li><a href="/Glank/TSP/tags" class="tabnav-tab" highlight="repo_tags">Tags <span class="counter blank">0</span></a></li>
    </ul>
    
  </span>

  <div class="tabnav-widget scope">


    <div class="select-menu js-menu-container js-select-menu js-branch-menu">
      <a class="minibutton select-menu-button js-menu-target" data-hotkey="w" data-ref="master">
        <span class="mini-icon mini-icon-branch"></span>
        <i>branch:</i>
        <span class="js-select-button">master</span>
      </a>

      <div class="select-menu-modal-holder js-menu-content js-navigation-container js-select-menu-pane">

        <div class="select-menu-modal js-select-menu-pane">
          <div class="select-menu-header">
            <span class="select-menu-title">Switch branches/tags</span>
            <span class="mini-icon mini-icon-remove-close js-menu-close"></span>
          </div> <!-- /.select-menu-header -->

          <div class="select-menu-filters">
            <div class="select-menu-text-filter">
              <input type="text" id="commitish-filter-field" class="js-filterable-field js-navigation-enable" placeholder="Find or create a branch…">
            </div>
            <div class="select-menu-tabs">
              <ul>
                <li class="select-menu-tab">
                  <a href="#" data-tab-filter="branches" class="js-select-menu-tab">Branches</a>
                </li>
                <li class="select-menu-tab">
                  <a href="#" data-tab-filter="tags" class="js-select-menu-tab">Tags</a>
                </li>
              </ul>
            </div><!-- /.select-menu-tabs -->
          </div><!-- /.select-menu-filters -->

          <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket css-truncate" data-tab-filter="branches" data-filterable-for="commitish-filter-field" data-filterable-type="substring">


              <div class="select-menu-item js-navigation-item js-navigation-target selected">
                <span class="select-menu-item-icon mini-icon mini-icon-confirm"></span>
                <a href="/Glank/TSP/blob/master/README.md" class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target" data-name="master" rel="nofollow" title="master">master</a>
              </div> <!-- /.select-menu-item -->

              <form accept-charset="UTF-8" action="/Glank/TSP/branches" class="js-create-branch select-menu-item select-menu-new-item-form js-not-filterable js-navigation-item js-navigation-target js-new-item-form" method="post"><div style="margin:0;padding:0;display:inline"><input name="authenticity_token" type="hidden" value="E5aRcgHhmj8pv12bkpxGKQRCvWaCC1yNDXHyS2uvQBU=" /></div>


                <span class="mini-icon mini-icon-branch-create select-menu-item-icon"></span>
                <div class="select-menu-item-text">
                  <h4>Create branch: <span class="js-new-item-name"></span></h4>
                  <span class="description">from ‘master’</span>
                </div>
                <input type="hidden" name="name" id="name" class="js-new-item-submit" />
                <input type="hidden" name="branch" id="branch" value="master" />
                <input type="hidden" name="path" id="branch" value="README.md" />

              </form> <!-- /.select-menu-footer -->


          </div> <!-- /.select-menu-list -->


          <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket css-truncate" data-tab-filter="tags" data-filterable-for="commitish-filter-field" data-filterable-type="substring">


            <div class="select-menu-no-results js-not-filterable">Nothing to show</div>

          </div> <!-- /.select-menu-list -->

        </div> <!-- /.select-menu-modal -->
      </div> <!-- /.select-menu-modal-holder -->
    </div> <!-- /.select-menu -->

  </div> <!-- /.scope -->

  <ul class="tabnav-tabs">
    <li><a href="/Glank/TSP" class="selected tabnav-tab" highlight="repo_source">Files</a></li>
    <li><a href="/Glank/TSP/commits/master" class="tabnav-tab" highlight="repo_commits">Commits</a></li>
    <li><a href="/Glank/TSP/branches" class="tabnav-tab" highlight="repo_branches" rel="nofollow">Branches <span class="counter ">1</span></a></li>
  </ul>

</div>

  
  
  


            
          </div>
        </div><!-- /.repohead -->

        <div id="js-repo-pjax-container" class="container context-loader-container" data-pjax-container>
          


<!-- blob contrib key: blob_contributors:v21:0c2f549110f0d5d4843a49119e35133d -->
<!-- blob contrib frag key: views10/v8/blob_contributors:v21:0c2f549110f0d5d4843a49119e35133d -->


<div id="slider">
    <div class="frame-meta">

      <p title="This is a placeholder element" class="js-history-link-replace hidden"></p>

        <div class="breadcrumb">
          <span class='bold'><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/Glank/TSP" class="js-slide-to" data-branch="master" data-direction="back" itemscope="url"><span itemprop="title">TSP</span></a></span></span><span class="separator"> / </span><strong class="final-path">README.md</strong> <span class="js-zeroclipboard zeroclipboard-button" data-clipboard-text="README.md" data-copied-hint="copied!" title="copy to clipboard"><span class="mini-icon mini-icon-clipboard"></span></span>
        </div>

      <a href="/Glank/TSP/find/master" class="js-slide-to" data-hotkey="t" style="display:none">Show File Finder</a>


        <div class="commit commit-loader file-history-tease js-deferred-content" data-url="/Glank/TSP/contributors/master/README.md">
          Fetching contributors…

          <div class="participation">
            <p class="loader-loading"><img alt="Octocat-spinner-32-eaf2f5" height="16" src="https://a248.e.akamai.net/assets.github.com/images/spinners/octocat-spinner-32-EAF2F5.gif?1334862346" width="16" /></p>
            <p class="loader-error">Cannot retrieve contributors at this time</p>
          </div>
        </div>

    </div><!-- ./.frame-meta -->

    <div class="frames">
      <div class="frame" data-permalink-url="/Glank/TSP/blob/739635ae1b4dc584c4298b0e4a7fc752efc7eeff/README.md" data-title="TSP/README.md at master · Glank/TSP · GitHub" data-type="blob">

        <div id="files" class="bubble">
          <div class="file">
            <div class="meta">
              <div class="info">
                <span class="icon"><b class="mini-icon mini-icon-text-file"></b></span>
                <span class="mode" title="File Mode">file</span>
                  <span>50 lines (46 sloc)</span>
                <span>2.728 kb</span>
              </div>
              <div class="actions">
                <div class="button-group">
                        <a class="minibutton"
                           href="/Glank/TSP/edit/master/README.md"
                           data-method="post" rel="nofollow" data-hotkey="e">Edit</a>
                  <a href="/Glank/TSP/raw/master/README.md" class="button minibutton " id="raw-url">Raw</a>
                    <a href="/Glank/TSP/blame/master/README.md" class="button minibutton ">Blame</a>
                  <a href="/Glank/TSP/commits/master/README.md" class="button minibutton " rel="nofollow">History</a>
                </div><!-- /.button-group -->
              </div><!-- /.actions -->

            </div>
              
  <div id="readme" class="blob instapaper_body">
    <article class="markdown-body entry-content" itemprop="mainContentOfPage"><h1>
<a name="git-setup" class="anchor" href="#git-setup"><span class="mini-icon mini-icon-link"></span></a>Git Setup</h1>

<p></p><p></p><h2>
<a name="1---install-git" class="anchor" href="#1---install-git"><span class="mini-icon mini-icon-link"></span></a>1)   Install Git:</h2>
<br>If you're using windows, you can download it <a href="http://git-scm.com/downloads">here</a>.
<br>If you're using linux, just run this in the terminal:
<br><code>sudo apt-get install git</code>
<p></p><h2>
<a name="2---create-a-github-account" class="anchor" href="#2---create-a-github-account"><span class="mini-icon mini-icon-link"></span></a>2)   Create a GitHub account:</h2>
<br>Go to <a>GitHub.com</a> and register a free account.
<p></p><h2>
<a name="3---configure-git-to-your-personal-information" class="anchor" href="#3---configure-git-to-your-personal-information"><span class="mini-icon mini-icon-link"></span></a>3)   Configure Git to your personal information:</h2>
<br>Run the following commands in the terminal/command prompt:
<br><code>git config --global user.email "<a href="mailto:you@email.com">you@email.com</a>"</code>
<br><code>git config --global user.name "your name"</code>
<p></p><h2>
<a name="4---download-the-git-repository" class="anchor" href="#4---download-the-git-repository"><span class="mini-icon mini-icon-link"></span></a>4)   Download the git repository:</h2>
<br>In the terminal/command prompt, navigate to the folder where you wish to put the repository.
<br>Then run the following command: 
<br><code>git clone <a href="https://github.com/Glank/TSP.git">https://github.com/Glank/TSP.git</a></code>
<br>The current version in of the project will now be in [yourCurrentDirectory]/TSP
<p></p><h2>
<a name="5---install-a-merge-tool" class="anchor" href="#5---install-a-merge-tool"><span class="mini-icon mini-icon-link"></span></a>5)   Install a merge tool:</h2>
<br>If you're using windows, you can download kdiff3 <a href="http://sourceforge.net/projects/kdiff3/files/kdiff3/0.9.97/">here</a>.
<br>If you're using linux, just run this in the terminal:
<br><code>sudo apt-get install kdiff3</code>

<p></p><p></p><h1>
<a name="using-git" class="anchor" href="#using-git"><span class="mini-icon mini-icon-link"></span></a>Using Git</h1>
<br>To use git, you must first open the terminal or command prompt then navigate to the project directory.
<br>The following are basic things you can do with git:

<p></p><p></p><h2>
<a name="download-the-current-version-of-the-project" class="anchor" href="#download-the-current-version-of-the-project"><span class="mini-icon mini-icon-link"></span></a>Download the current version of the project</h2><br><br><code>git pull -u origin master</code>
<br>You'll see an error if you have made any changes without commiting though:
<br><code>git commit -m "Some comment"</code>
<p></p><h2>
<a name="upload-your-code-the-the-project" class="anchor" href="#upload-your-code-the-the-project"><span class="mini-icon mini-icon-link"></span></a>Upload your code the the project</h2>
<br><code>git add --all</code>
<br><code>git commit -m "Some comment"</code>
<br><code>git push -u origin master</code>
<br>An error can occur if your repositiry is not up to date.
<br>If so, just download the current version of the project.
<p></p><h2>
<a name="fix-merge-conflicts" class="anchor" href="#fix-merge-conflicts"><span class="mini-icon mini-icon-link"></span></a>Fix merge conflicts:</h2>
<br>Sometimes, when trying to sync your code and the existing project code, there will be merge conflicts.
<br>These occure when someone has already changed a line of code that you want to make a change to.
<br>To fix these errors, you'll need to open the merge tool. Run:
<br><code>git mergetool -t kdiff3</code>
<br>A file name will appear; hit enter.
<br>An interface should appear with the conflicting files.
<br>You can fix the errors by selecting A, B, or C from the top bar.
<br>To go to the next or previous error, click the down or up arror respectively.
<br>After you're done, save the file and close the program.
<br>Another file name may appear; repeat this process untill all the errors are corrected.
<br>Finally, run:
<br><code>git commit -a -m "Fixed merge conflicts."</code></article>
  </div>

          </div>
        </div>

        <a href="#jump-to-line" rel="facebox" data-hotkey="l" class="js-jump-to-line" style="display:none">Jump to Line</a>
        <div id="jump-to-line" style="display:none">
          <h2>Jump to Line</h2>
          <form accept-charset="UTF-8" class="js-jump-to-line-form">
            <input class="textfield js-jump-to-line-field" type="text">
            <div class="full-button">
              <button type="submit" class="button">Go</button>
            </div>
          </form>
        </div>

      </div>
    </div>
</div>

<div id="js-frame-loading-template" class="frame frame-loading large-loading-area" style="display:none;">
  <img class="js-frame-loading-spinner" src="https://a248.e.akamai.net/assets.github.com/images/spinners/octocat-spinner-128.gif?1347543529" height="64" width="64">
</div>


        </div>
      </div>
      <div class="context-overlay"></div>
    </div>

      <div id="footer-push"></div><!-- hack for sticky footer -->
    </div><!-- end of wrapper - hack for sticky footer -->

      <!-- footer -->
      <div id="footer">
  <div class="container clearfix">

      <dl class="footer_nav">
        <dt>GitHub</dt>
        <dd><a href="https://github.com/about">About us</a></dd>
        <dd><a href="https://github.com/blog">Blog</a></dd>
        <dd><a href="https://github.com/contact">Contact &amp; support</a></dd>
        <dd><a href="http://enterprise.github.com/">GitHub Enterprise</a></dd>
        <dd><a href="http://status.github.com/">Site status</a></dd>
      </dl>

      <dl class="footer_nav">
        <dt>Applications</dt>
        <dd><a href="http://mac.github.com/">GitHub for Mac</a></dd>
        <dd><a href="http://windows.github.com/">GitHub for Windows</a></dd>
        <dd><a href="http://eclipse.github.com/">GitHub for Eclipse</a></dd>
        <dd><a href="http://mobile.github.com/">GitHub mobile apps</a></dd>
      </dl>

      <dl class="footer_nav">
        <dt>Services</dt>
        <dd><a href="http://get.gaug.es/">Gauges: Web analytics</a></dd>
        <dd><a href="http://speakerdeck.com">Speaker Deck: Presentations</a></dd>
        <dd><a href="https://gist.github.com">Gist: Code snippets</a></dd>
        <dd><a href="http://jobs.github.com/">Job board</a></dd>
      </dl>

      <dl class="footer_nav">
        <dt>Documentation</dt>
        <dd><a href="http://help.github.com/">GitHub Help</a></dd>
        <dd><a href="http://developer.github.com/">Developer API</a></dd>
        <dd><a href="http://github.github.com/github-flavored-markdown/">GitHub Flavored Markdown</a></dd>
        <dd><a href="http://pages.github.com/">GitHub Pages</a></dd>
      </dl>

      <dl class="footer_nav">
        <dt>More</dt>
        <dd><a href="http://training.github.com/">Training</a></dd>
        <dd><a href="https://github.com/edu">Students &amp; teachers</a></dd>
        <dd><a href="http://shop.github.com">The Shop</a></dd>
        <dd><a href="/plans">Plans &amp; pricing</a></dd>
        <dd><a href="http://octodex.github.com/">The Octodex</a></dd>
      </dl>

      <hr class="footer-divider">


    <p class="right">&copy; 2013 <span title="0.14675s from fe13.rs.github.com">GitHub</span>, Inc. All rights reserved.</p>
    <a class="left" href="https://github.com/">
      <span class="mega-icon mega-icon-invertocat"></span>
    </a>
    <ul id="legal">
        <li><a href="https://github.com/site/terms">Terms of Service</a></li>
        <li><a href="https://github.com/site/privacy">Privacy</a></li>
        <li><a href="https://github.com/security">Security</a></li>
    </ul>

  </div><!-- /.container -->

</div><!-- /.#footer -->


    <div class="fullscreen-overlay js-fullscreen-overlay" id="fullscreen_overlay">
  <div class="fullscreen-container js-fullscreen-container">
    <div class="textarea-wrap">
      <textarea name="fullscreen-contents" id="fullscreen-contents" class="js-fullscreen-contents" placeholder="" data-suggester="fullscreen_suggester"></textarea>
          <div class="suggester-container">
              <div class="suggester fullscreen-suggester js-navigation-container" id="fullscreen_suggester"
                 data-url="/Glank/TSP/suggestions/commit">
              </div>
          </div>
    </div>
  </div>
  <div class="fullscreen-sidebar">
    <a href="#" class="exit-fullscreen js-exit-fullscreen tooltipped leftwards" title="Exit Zen Mode">
      <span class="mega-icon mega-icon-normalscreen"></span>
    </a>
    <a href="#" class="theme-switcher js-theme-switcher tooltipped leftwards"
      title="Switch themes">
      <span class="mini-icon mini-icon-brightness"></span>
    </a>
  </div>
</div>



    <div id="ajax-error-message" class="flash flash-error">
      <span class="mini-icon mini-icon-exclamation"></span>
      Something went wrong with that request. Please try again.
      <a href="#" class="mini-icon mini-icon-remove-close ajax-error-dismiss"></a>
    </div>

    
    
    <span id='server_response_time' data-time='0.14726' data-host='fe13'></span>
    
  </body>
</html>

