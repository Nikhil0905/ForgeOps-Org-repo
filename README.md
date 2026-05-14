# ForgeOps — Organization Central Repository

> **Centralized codebase managed by [ForgeOps](https://github.com/Nikhil0905/ForgeOps-Offline-First-DevOps-Platform), the Offline-First DevOps Platform.**

---

## About This Repository

This repository serves as the **organization's central code repository**, automatically synchronized from the internal [ForgeOps](https://github.com/Nikhil0905/ForgeOps-Offline-First-DevOps-Platform) DevOps platform. Rather than pushing code directly to `main`, each project developed within the organization is synced as a **dedicated branch** under the `projects/` namespace.

This approach enforces proper **code review, supervision, and branching best practices** — ensuring that no project merges into the mainline without going through the appropriate review and approval workflow.

## Branching Strategy

```
main                            ← Protected mainline (stable, reviewed code only)
├── projects/celebration-app    ← Java-based celebration web app
├── projects/sample-python-app  ← Python Flask microservice
├── projects/<new-project>      ← Auto-created when a new project is added in ForgeOps
└── ...
```

| Branch | Description |
|--------|-------------|
| `main` | Protected mainline — only reviewed and approved code is merged here |
| `projects/*` | Individual project branches, auto-synced from the local Gitea instance via ForgeOps Sync Engine |

### Why branches instead of direct pushes?

- **Code Review** — Each project lives in its own branch, requiring a Pull Request and review before merging into `main`
- **Isolation** — Projects are developed independently without affecting each other or the stable mainline
- **Traceability** — Full commit history per project, with clear separation of concerns
- **CI/CD Integration** — Branch-based workflows enable per-project build pipelines and automated testing
- **Supervision** — Team leads and reviewers can monitor progress on each project branch before approving merges

## How It Works

1. Developers create and work on projects in the **local Gitea instance** (hosted by ForgeOps)
2. The **ForgeOps Sync Engine** automatically detects all local repositories every 60 seconds
3. Each repo is pushed as a `projects/<repo-name>` branch to this central GitHub repository
4. When offline, changes are **queued locally** and synced automatically when connectivity is restored
5. Merges to `main` happen only through **reviewed Pull Requests**

## Managed By

**[ForgeOps — Offline-First DevOps Platform](https://github.com/Nikhil0905/ForgeOps-Offline-First-DevOps-Platform)**  
A fully self-hosted, offline-capable DevOps environment featuring Jenkins CI/CD, Gitea repositories, Docker Registry, Prometheus monitoring, and automated GitHub synchronization.

---

*This repository is automatically maintained by the ForgeOps Sync Engine. Do not push directly to `projects/*` branches — they are managed by the platform.*
