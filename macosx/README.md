# MACOSX command line

### System information

Get system information. Can also output in xml format for command line parsing.

`system_profiler`

### SCUtil

Gets current values for dynamic configuration

*DNS*

`scutil --dns`

*Check reachabilibilt of address*

`scutil -r google.com`


### DiskUtil

Get disk information

*List filesystems*

`disktutil list`

*Info on a disk*

`diskutil info disk0`

### System setup

For setting up some preferences on a mac.

`systemsetup -help`

### Network setup

Setting up network prefs

`networksetup -help`

### Software update

For updating mac software

`softwareupdate --help`

### PMSet

Configure power management settings

`pmset -g`

Get stats

`pmset -g stats`

Reset to defaults

`pmset restoreDefaults`

Get everything

`pmset -g everything`
