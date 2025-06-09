import type { Config } from "jest";

const config: Config = {
  preset: "ts-jest",
  testEnvironment: "node",
  roots: ["<rootDir>/problems"],
  testMatch: ["<rootDir>/problems/**/?(*.)+(test).ts"],
  verbose: true,
};

export default config;
