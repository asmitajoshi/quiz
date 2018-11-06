#!/home/asmita/anaconda2/bin/python

import random
def genIp():
  return '.'.join(map(lambda x: str(random.randint(0, 255)), range(4)))

for i in range(10):
  print(genIp())

# def genIpInt():
#   my $ipInt = 1 + int(rand(2 ** 32 - 1))
#   my $ip = join '.', unpack('C4', pack('N', $ipInt))
#   warn $ip
#   return $ip

# def genMac():
#   my $ri = sub { 1 + int(rand(2 ** 8 - 1)) }
#   my $mac = join ':', map { sprintf("%0X", $ri->()) } (0..5)
#   warn $mac
#   return $mac



# print("\n\n");
# for i in range(10):
#   print(genIpInt())
# }

# print("\n\n");
# for i in range(10):
#   print(genMac())
# }
