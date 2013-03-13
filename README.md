<h1>Git Setup</h1>

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
<br>If you are using Eclipse, you should navigate into your workspace folder.
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
<br><code>git commit -a -m "Fixed merge conflicts."</code>

