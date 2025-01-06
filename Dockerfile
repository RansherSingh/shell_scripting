FROM nginx
CMD ["sh", "-c", "echo 'Hostname inside the container is:' && hostname"]

