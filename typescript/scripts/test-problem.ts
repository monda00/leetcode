import { execSync } from "child_process";

const args = process.argv.slice(2);
if (args.length === 0) {
  console.error("Usage: npm run test:problem <keyword>");
  process.exit(1);
}

const keyword = args[0];

try {
  execSync(`npx jest --testPathPattern=${keyword}`, { stdio: "inherit" });
} catch (err) {
  process.exit(1);
}
