#!/usr/bin/env bash

# Create schema and tables
mysql  --user=root --password="1366613Sudo" < ../database/creation.sql

# Fill tables with initial data
mysql  --user=root --password="1366613Sudo"  < ../database/initialization.sql