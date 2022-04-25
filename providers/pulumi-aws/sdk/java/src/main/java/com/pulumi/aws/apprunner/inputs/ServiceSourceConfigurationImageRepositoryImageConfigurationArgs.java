// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apprunner.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceSourceConfigurationImageRepositoryImageConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceSourceConfigurationImageRepositoryImageConfigurationArgs Empty = new ServiceSourceConfigurationImageRepositoryImageConfigurationArgs();

    /**
     * The port that your application listens to in the container. Defaults to `&#34;8080&#34;`.
     * 
     */
    @Import(name="port")
    private @Nullable Output<String> port;

    /**
     * @return The port that your application listens to in the container. Defaults to `&#34;8080&#34;`.
     * 
     */
    public Optional<Output<String>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Environment variables available to your running App Runner service. A map of key/value pairs. Keys with a prefix of `AWSAPPRUNNER` are reserved for system use and aren&#39;t valid.
     * 
     */
    @Import(name="runtimeEnvironmentVariables")
    private @Nullable Output<Map<String,String>> runtimeEnvironmentVariables;

    /**
     * @return Environment variables available to your running App Runner service. A map of key/value pairs. Keys with a prefix of `AWSAPPRUNNER` are reserved for system use and aren&#39;t valid.
     * 
     */
    public Optional<Output<Map<String,String>>> runtimeEnvironmentVariables() {
        return Optional.ofNullable(this.runtimeEnvironmentVariables);
    }

    /**
     * A command App Runner runs to start the application in the source image. If specified, this command overrides the Docker image’s default start command.
     * 
     */
    @Import(name="startCommand")
    private @Nullable Output<String> startCommand;

    /**
     * @return A command App Runner runs to start the application in the source image. If specified, this command overrides the Docker image’s default start command.
     * 
     */
    public Optional<Output<String>> startCommand() {
        return Optional.ofNullable(this.startCommand);
    }

    private ServiceSourceConfigurationImageRepositoryImageConfigurationArgs() {}

    private ServiceSourceConfigurationImageRepositoryImageConfigurationArgs(ServiceSourceConfigurationImageRepositoryImageConfigurationArgs $) {
        this.port = $.port;
        this.runtimeEnvironmentVariables = $.runtimeEnvironmentVariables;
        this.startCommand = $.startCommand;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceSourceConfigurationImageRepositoryImageConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceSourceConfigurationImageRepositoryImageConfigurationArgs $;

        public Builder() {
            $ = new ServiceSourceConfigurationImageRepositoryImageConfigurationArgs();
        }

        public Builder(ServiceSourceConfigurationImageRepositoryImageConfigurationArgs defaults) {
            $ = new ServiceSourceConfigurationImageRepositoryImageConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param port The port that your application listens to in the container. Defaults to `&#34;8080&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<String> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port that your application listens to in the container. Defaults to `&#34;8080&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder port(String port) {
            return port(Output.of(port));
        }

        /**
         * @param runtimeEnvironmentVariables Environment variables available to your running App Runner service. A map of key/value pairs. Keys with a prefix of `AWSAPPRUNNER` are reserved for system use and aren&#39;t valid.
         * 
         * @return builder
         * 
         */
        public Builder runtimeEnvironmentVariables(@Nullable Output<Map<String,String>> runtimeEnvironmentVariables) {
            $.runtimeEnvironmentVariables = runtimeEnvironmentVariables;
            return this;
        }

        /**
         * @param runtimeEnvironmentVariables Environment variables available to your running App Runner service. A map of key/value pairs. Keys with a prefix of `AWSAPPRUNNER` are reserved for system use and aren&#39;t valid.
         * 
         * @return builder
         * 
         */
        public Builder runtimeEnvironmentVariables(Map<String,String> runtimeEnvironmentVariables) {
            return runtimeEnvironmentVariables(Output.of(runtimeEnvironmentVariables));
        }

        /**
         * @param startCommand A command App Runner runs to start the application in the source image. If specified, this command overrides the Docker image’s default start command.
         * 
         * @return builder
         * 
         */
        public Builder startCommand(@Nullable Output<String> startCommand) {
            $.startCommand = startCommand;
            return this;
        }

        /**
         * @param startCommand A command App Runner runs to start the application in the source image. If specified, this command overrides the Docker image’s default start command.
         * 
         * @return builder
         * 
         */
        public Builder startCommand(String startCommand) {
            return startCommand(Output.of(startCommand));
        }

        public ServiceSourceConfigurationImageRepositoryImageConfigurationArgs build() {
            return $;
        }
    }

}
