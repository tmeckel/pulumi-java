// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackendServiceIAPOAuth2ClientInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendServiceIAPOAuth2ClientInfoArgs Empty = new BackendServiceIAPOAuth2ClientInfoArgs();

    /**
     * Application name to be used in OAuth consent screen.
     * 
     */
    @Import(name="applicationName")
    private @Nullable Output<String> applicationName;

    /**
     * @return Application name to be used in OAuth consent screen.
     * 
     */
    public Optional<Output<String>> applicationName() {
        return Optional.ofNullable(this.applicationName);
    }

    /**
     * Name of the client to be generated. Optional - If not provided, the name will be autogenerated by the backend.
     * 
     */
    @Import(name="clientName")
    private @Nullable Output<String> clientName;

    /**
     * @return Name of the client to be generated. Optional - If not provided, the name will be autogenerated by the backend.
     * 
     */
    public Optional<Output<String>> clientName() {
        return Optional.ofNullable(this.clientName);
    }

    /**
     * Developer&#39;s information to be used in OAuth consent screen.
     * 
     */
    @Import(name="developerEmailAddress")
    private @Nullable Output<String> developerEmailAddress;

    /**
     * @return Developer&#39;s information to be used in OAuth consent screen.
     * 
     */
    public Optional<Output<String>> developerEmailAddress() {
        return Optional.ofNullable(this.developerEmailAddress);
    }

    private BackendServiceIAPOAuth2ClientInfoArgs() {}

    private BackendServiceIAPOAuth2ClientInfoArgs(BackendServiceIAPOAuth2ClientInfoArgs $) {
        this.applicationName = $.applicationName;
        this.clientName = $.clientName;
        this.developerEmailAddress = $.developerEmailAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendServiceIAPOAuth2ClientInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendServiceIAPOAuth2ClientInfoArgs $;

        public Builder() {
            $ = new BackendServiceIAPOAuth2ClientInfoArgs();
        }

        public Builder(BackendServiceIAPOAuth2ClientInfoArgs defaults) {
            $ = new BackendServiceIAPOAuth2ClientInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationName Application name to be used in OAuth consent screen.
         * 
         * @return builder
         * 
         */
        public Builder applicationName(@Nullable Output<String> applicationName) {
            $.applicationName = applicationName;
            return this;
        }

        /**
         * @param applicationName Application name to be used in OAuth consent screen.
         * 
         * @return builder
         * 
         */
        public Builder applicationName(String applicationName) {
            return applicationName(Output.of(applicationName));
        }

        /**
         * @param clientName Name of the client to be generated. Optional - If not provided, the name will be autogenerated by the backend.
         * 
         * @return builder
         * 
         */
        public Builder clientName(@Nullable Output<String> clientName) {
            $.clientName = clientName;
            return this;
        }

        /**
         * @param clientName Name of the client to be generated. Optional - If not provided, the name will be autogenerated by the backend.
         * 
         * @return builder
         * 
         */
        public Builder clientName(String clientName) {
            return clientName(Output.of(clientName));
        }

        /**
         * @param developerEmailAddress Developer&#39;s information to be used in OAuth consent screen.
         * 
         * @return builder
         * 
         */
        public Builder developerEmailAddress(@Nullable Output<String> developerEmailAddress) {
            $.developerEmailAddress = developerEmailAddress;
            return this;
        }

        /**
         * @param developerEmailAddress Developer&#39;s information to be used in OAuth consent screen.
         * 
         * @return builder
         * 
         */
        public Builder developerEmailAddress(String developerEmailAddress) {
            return developerEmailAddress(Output.of(developerEmailAddress));
        }

        public BackendServiceIAPOAuth2ClientInfoArgs build() {
            return $;
        }
    }

}
