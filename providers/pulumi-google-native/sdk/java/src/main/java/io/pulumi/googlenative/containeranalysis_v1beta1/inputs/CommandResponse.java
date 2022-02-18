// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Command describes a step performed as part of the build pipeline.
 * 
 */
public final class CommandResponse extends io.pulumi.resources.InvokeArgs {

    public static final CommandResponse Empty = new CommandResponse();

    /**
     * Command-line arguments used when executing this command.
     * 
     */
    @InputImport(name="args", required=true)
    private final List<String> args;

    public List<String> getArgs() {
        return this.args;
    }

    /**
     * Working directory (relative to project source root) used when running this command.
     * 
     */
    @InputImport(name="dir", required=true)
    private final String dir;

    public String getDir() {
        return this.dir;
    }

    /**
     * Environment variables set before running this command.
     * 
     */
    @InputImport(name="env", required=true)
    private final List<String> env;

    public List<String> getEnv() {
        return this.env;
    }

    /**
     * Name of the command, as presented on the command line, or if the command is packaged as a Docker container, as presented to `docker pull`.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The ID(s) of the command(s) that this command depends on.
     * 
     */
    @InputImport(name="waitFor", required=true)
    private final List<String> waitFor;

    public List<String> getWaitFor() {
        return this.waitFor;
    }

    public CommandResponse(
        List<String> args,
        String dir,
        List<String> env,
        String name,
        List<String> waitFor) {
        this.args = Objects.requireNonNull(args, "expected parameter 'args' to be non-null");
        this.dir = Objects.requireNonNull(dir, "expected parameter 'dir' to be non-null");
        this.env = Objects.requireNonNull(env, "expected parameter 'env' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.waitFor = Objects.requireNonNull(waitFor, "expected parameter 'waitFor' to be non-null");
    }

    private CommandResponse() {
        this.args = List.of();
        this.dir = null;
        this.env = List.of();
        this.name = null;
        this.waitFor = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommandResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> args;
        private String dir;
        private List<String> env;
        private String name;
        private List<String> waitFor;

        public Builder() {
    	      // Empty
        }

        public Builder(CommandResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.dir = defaults.dir;
    	      this.env = defaults.env;
    	      this.name = defaults.name;
    	      this.waitFor = defaults.waitFor;
        }

        public Builder setArgs(List<String> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }

        public Builder setDir(String dir) {
            this.dir = Objects.requireNonNull(dir);
            return this;
        }

        public Builder setEnv(List<String> env) {
            this.env = Objects.requireNonNull(env);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setWaitFor(List<String> waitFor) {
            this.waitFor = Objects.requireNonNull(waitFor);
            return this;
        }

        public CommandResponse build() {
            return new CommandResponse(args, dir, env, name, waitFor);
        }
    }
}
