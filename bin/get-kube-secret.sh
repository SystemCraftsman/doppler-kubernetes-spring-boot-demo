#!/usr/bin/env bash

if [ $# -lt 1 ]; then
  echo 1>&2 "usage: $0 my-kube-secret"
  exit 2
fi

echo -e "\n### $1 ###\n\n\
$(kubectl get secret -o go-template='{{range $k,$v := .data}}{{$k}}={{$v|base64decode}}{{"\n"}}{{end}}' $@) \n"