// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A context rule provides information about the context for an individual API element.
 * 
 */
public final class ContextRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContextRuleArgs Empty = new ContextRuleArgs();

    /**
     * A list of full type names or extension IDs of extensions allowed in grpc side channel from client to backend.
     * 
     */
    @Import(name="allowedRequestExtensions")
    private @Nullable Output<List<String>> allowedRequestExtensions;

    /**
     * @return A list of full type names or extension IDs of extensions allowed in grpc side channel from client to backend.
     * 
     */
    public Optional<Output<List<String>>> allowedRequestExtensions() {
        return Optional.ofNullable(this.allowedRequestExtensions);
    }

    /**
     * A list of full type names or extension IDs of extensions allowed in grpc side channel from backend to client.
     * 
     */
    @Import(name="allowedResponseExtensions")
    private @Nullable Output<List<String>> allowedResponseExtensions;

    /**
     * @return A list of full type names or extension IDs of extensions allowed in grpc side channel from backend to client.
     * 
     */
    public Optional<Output<List<String>>> allowedResponseExtensions() {
        return Optional.ofNullable(this.allowedResponseExtensions);
    }

    /**
     * A list of full type names of provided contexts.
     * 
     */
    @Import(name="provided")
    private @Nullable Output<List<String>> provided;

    /**
     * @return A list of full type names of provided contexts.
     * 
     */
    public Optional<Output<List<String>>> provided() {
        return Optional.ofNullable(this.provided);
    }

    /**
     * A list of full type names of requested contexts.
     * 
     */
    @Import(name="requested")
    private @Nullable Output<List<String>> requested;

    /**
     * @return A list of full type names of requested contexts.
     * 
     */
    public Optional<Output<List<String>>> requested() {
        return Optional.ofNullable(this.requested);
    }

    /**
     * Selects the methods to which this rule applies. Refer to selector for syntax details.
     * 
     */
    @Import(name="selector")
    private @Nullable Output<String> selector;

    /**
     * @return Selects the methods to which this rule applies. Refer to selector for syntax details.
     * 
     */
    public Optional<Output<String>> selector() {
        return Optional.ofNullable(this.selector);
    }

    private ContextRuleArgs() {}

    private ContextRuleArgs(ContextRuleArgs $) {
        this.allowedRequestExtensions = $.allowedRequestExtensions;
        this.allowedResponseExtensions = $.allowedResponseExtensions;
        this.provided = $.provided;
        this.requested = $.requested;
        this.selector = $.selector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContextRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContextRuleArgs $;

        public Builder() {
            $ = new ContextRuleArgs();
        }

        public Builder(ContextRuleArgs defaults) {
            $ = new ContextRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedRequestExtensions A list of full type names or extension IDs of extensions allowed in grpc side channel from client to backend.
         * 
         * @return builder
         * 
         */
        public Builder allowedRequestExtensions(@Nullable Output<List<String>> allowedRequestExtensions) {
            $.allowedRequestExtensions = allowedRequestExtensions;
            return this;
        }

        /**
         * @param allowedRequestExtensions A list of full type names or extension IDs of extensions allowed in grpc side channel from client to backend.
         * 
         * @return builder
         * 
         */
        public Builder allowedRequestExtensions(List<String> allowedRequestExtensions) {
            return allowedRequestExtensions(Output.of(allowedRequestExtensions));
        }

        /**
         * @param allowedRequestExtensions A list of full type names or extension IDs of extensions allowed in grpc side channel from client to backend.
         * 
         * @return builder
         * 
         */
        public Builder allowedRequestExtensions(String... allowedRequestExtensions) {
            return allowedRequestExtensions(List.of(allowedRequestExtensions));
        }

        /**
         * @param allowedResponseExtensions A list of full type names or extension IDs of extensions allowed in grpc side channel from backend to client.
         * 
         * @return builder
         * 
         */
        public Builder allowedResponseExtensions(@Nullable Output<List<String>> allowedResponseExtensions) {
            $.allowedResponseExtensions = allowedResponseExtensions;
            return this;
        }

        /**
         * @param allowedResponseExtensions A list of full type names or extension IDs of extensions allowed in grpc side channel from backend to client.
         * 
         * @return builder
         * 
         */
        public Builder allowedResponseExtensions(List<String> allowedResponseExtensions) {
            return allowedResponseExtensions(Output.of(allowedResponseExtensions));
        }

        /**
         * @param allowedResponseExtensions A list of full type names or extension IDs of extensions allowed in grpc side channel from backend to client.
         * 
         * @return builder
         * 
         */
        public Builder allowedResponseExtensions(String... allowedResponseExtensions) {
            return allowedResponseExtensions(List.of(allowedResponseExtensions));
        }

        /**
         * @param provided A list of full type names of provided contexts.
         * 
         * @return builder
         * 
         */
        public Builder provided(@Nullable Output<List<String>> provided) {
            $.provided = provided;
            return this;
        }

        /**
         * @param provided A list of full type names of provided contexts.
         * 
         * @return builder
         * 
         */
        public Builder provided(List<String> provided) {
            return provided(Output.of(provided));
        }

        /**
         * @param provided A list of full type names of provided contexts.
         * 
         * @return builder
         * 
         */
        public Builder provided(String... provided) {
            return provided(List.of(provided));
        }

        /**
         * @param requested A list of full type names of requested contexts.
         * 
         * @return builder
         * 
         */
        public Builder requested(@Nullable Output<List<String>> requested) {
            $.requested = requested;
            return this;
        }

        /**
         * @param requested A list of full type names of requested contexts.
         * 
         * @return builder
         * 
         */
        public Builder requested(List<String> requested) {
            return requested(Output.of(requested));
        }

        /**
         * @param requested A list of full type names of requested contexts.
         * 
         * @return builder
         * 
         */
        public Builder requested(String... requested) {
            return requested(List.of(requested));
        }

        /**
         * @param selector Selects the methods to which this rule applies. Refer to selector for syntax details.
         * 
         * @return builder
         * 
         */
        public Builder selector(@Nullable Output<String> selector) {
            $.selector = selector;
            return this;
        }

        /**
         * @param selector Selects the methods to which this rule applies. Refer to selector for syntax details.
         * 
         * @return builder
         * 
         */
        public Builder selector(String selector) {
            return selector(Output.of(selector));
        }

        public ContextRuleArgs build() {
            return $;
        }
    }

}
