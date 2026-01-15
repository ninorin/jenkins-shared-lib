def call() {
    if (env.BRANCH_NAME == 'main') {
        echo "[SharedLib] deploying to production"
        sh "echo Deploying application..."
    } else {
        echo "[SharedLib] deploy skipped (branch != main)"
    }
}
