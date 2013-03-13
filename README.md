</a>Git Setup</h1>

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

