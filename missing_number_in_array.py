#!/usr/bin/python

# missing number from sorted array
items = [1, 2, 3, 5]

def bin_search(items):
#  print 'items: ' + str(items)
  count = len(items) + 1
#  print 'length of items: ' + str(len(items))
  start = items[0]
  if (len(items) == 1):
    print 'found missing number: ' + str(start + 1)
    return
  half = int(count / 2)
#  print 'middle elem: ' + str(half)
  expected_num = start + half
  got_num = items[half]
#  print 'expected in middle: ' + str(expected_num)
#  print 'got in middle: ' + str(got_num)
  if got_num == expected_num:
#    print 'got ' + str(items[half::])
    bin_search(items[half::])
  elif got_num != expected_num:
#    print 'not got ' + str(items[0:half])
    bin_search(items[0:half])


items = [1, 2, 3, 5]
bin_search(items)

items = [1, 2, 3, 5, 6, 7, 8]
bin_search(items)

items = [1, 2, 3, 4, 5, 6, 8, 9, 10]
bin_search(items)

items = [1, 3, 4, 5, 6, 7, 8, 9, 10]
bin_search(items)

# test failed
items = [2, 3, 4, 5, 6, 7, 8, 9, 10]
bin_search(items)
