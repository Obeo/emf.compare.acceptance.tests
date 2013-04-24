-------------------------------------------------------------------------------
ts001_2-way :
-------------------------------------------------------------------------------

* ts001_tc002 : The synchro on the first element works. When selecting a new element which 
                doesn't belongs to the same match, the old container is still expanded in the left content merge viewer.
			    (https://bugs.eclipse.org/bugs/show_bug.cgi?id=406310)
* ts001_tc004 : the button next difference doen't really reach the next difference. Only the difference that are leaves in the tree are reached. 
			    (https://bugs.eclipse.org/bugs/show_bug.cgi?id=400424)

-------------------------------------------------------------------------------
ts005_egit :
-------------------------------------------------------------------------------

* ts005_tc004 : there are too many results displayed in the structure merge viewer.
* ts005_tc005 : there are too many results displayed in the structure merge viewer.

-------------------------------------------------------------------------------
ts007_merge :
-------------------------------------------------------------------------------

* ts007_tc003 : the button copy current change form left to right doesn't select the next difference (in the structure and content merge viewers) after merge.
			    (https://bugs.eclipse.org/bugs/show_bug.cgi?id=400691)