# Installation Guide #

This page describes how to install components of moliz.

## Prerequisites ##

Before installing components of moliz, you have to install the following.

  * [Eclipse Modeling Tools](http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/junosr2)
  * [EMF Profiles](https://code.google.com/a/eclipselabs.org/p/emf-profiles/) (only for xMOF execution support)
  * [Graphiti](http://www.eclipse.org/graphiti/) (only for xMOF execution support)
  * [Papyrus](http://www.eclipse.org/papyrus/) (only for performance analysis support)
  * Papyurs MARTE UML language extension (only for performance analysis support; this Papyrus component can be installed using the Papyrus plug-in (Papyrus Additional Components Discovery))
  * [Scala](http://scala-ide.org/) (only for performance analysis support)

## Details ##

  1. Download and install [Eclipse Modeling Tools](http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/junosr2) if you haven't already
  1. Add the Moliz update site
    1. Click _Help_ -> _Install New Software_
    1. Insert _http://www.modelexecution.org/updates/_ into _Work with:_
    1. Click _Add..._ and insert _Moliz Updates_ as a name of the new update site and hit _OK_
  1. The feature category _Moliz_ should appear in the list of installable features
  1. Select all features (or the ones you want to install)
  1. Hit _Next >_
  1. Accept terms of license and restart Eclipse after the installation has been performed