use strict;
use warnings;

use Data::Dumper;

warn 'fail' if (getAbsolutePath('/abc/de/../xyz') ne '/abc/xyz'); #/abc/xyz
warn 'fail' if (getAbsolutePath('/abc/de/./xyz') ne '/abc/de/xyz'); #/abc/de/xyz
warn 'fail' if (getAbsolutePath('/abc/de/./xyz/../') ne '/abc/de'); #/abc/de
warn 'fail' if (getAbsolutePath('/abc/../../../')); # error
warn 'fail' if (getAbsolutePath('/abc/../xyz/../../../abc/') ne '/abc/../xyz/../ found error'); # error
sub getAbsolutePath {
  my ($relativePath) = @_;

  my @pathParts = split /\//, $relativePath;
  #warn Data::Dumper->Dump([\@pathParts], [qw(pathParts)]);

  my @resStack = ();
  map {
   if ($_ eq '..') {
     pop @resStack;
   } elsif ($_ eq '.') {
   } else {
     push @resStack, $_;
   }
  } @pathParts;

  #warn Data::Dumper->Dump([\@resStack], [qw(resStack)]);
  my $absPath = join '/', @resStack;
  #warn $absPath;
  return $absPath;
}

