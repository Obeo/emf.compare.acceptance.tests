-------------------------------------------------------------------------------
ts001_2-way :
-------------------------------------------------------------------------------

* ts001_tc004 : the button next difference doen't really reach the next difference. Only the difference that are leaves in the tree are reached. 
			    (https://bugs.eclipse.org/bugs/show_bug.cgi?id=400424)
* ts001_tc005 : test to be finished. impossible to get menu item when two objects are selected in the sample ecore editor. http://jira4.xored.com/browse/QS-2373
* ts001_tc006 : test to be finished. impossible to get menu item when two objects are selected in the sample ecore editor. http://jira4.xored.com/browse/QS-2373


-------------------------------------------------------------------------------
ts002_3-way :
-------------------------------------------------------------------------------

* ts002_tc002 : this will be ok when the pseudo filter (active by default) will be implemented.

-------------------------------------------------------------------------------
ts005_egit :
-------------------------------------------------------------------------------

* ts005_tc004 : there are too many results displayed in the structure merge viewer.
* ts005_tc005 : there are too many results displayed in the structure merge viewer.
* ts005_tc009 : when click on Compare With > Git Index, a NPE is raised. Waiting for new version of EGit.
* ts005_tc013 : this test will be ok when the save button disabled will be implemented (https://bugs.eclipse.org/bugs/show_bug.cgi?id=399270), and when the NPE on Compare With > Git Index will be resolved.

-------------------------------------------------------------------------------
ts007_merge :
-------------------------------------------------------------------------------

* ts007_tc003 : the button copy current change form left to right doesn't select the next difference (in the structure and content merge viewers) after merge.
			    (https://bugs.eclipse.org/bugs/show_bug.cgi?id=400691)