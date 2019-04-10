#!/usr/bin/env bash
# User: nox PASSWORD: password

# Create schema and tables
mysql  mysql -u nox -p <  ../database/creation.sql

# Fill tables with initial data
mysql  mysql -u nox -p <  ../database/initialization.sql