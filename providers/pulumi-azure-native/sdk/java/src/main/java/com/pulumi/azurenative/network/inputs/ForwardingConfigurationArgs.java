// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.FrontDoorForwardingProtocol;
import com.pulumi.azurenative.network.inputs.CacheConfigurationArgs;
import com.pulumi.azurenative.network.inputs.SubResourceArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes Forwarding Route.
 * 
 */
public final class ForwardingConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ForwardingConfigurationArgs Empty = new ForwardingConfigurationArgs();

    /**
     * A reference to the BackendPool which this rule routes to.
     * 
     */
    @Import(name="backendPool")
    private @Nullable Output<SubResourceArgs> backendPool;

    /**
     * @return A reference to the BackendPool which this rule routes to.
     * 
     */
    public Optional<Output<SubResourceArgs>> backendPool() {
        return Optional.ofNullable(this.backendPool);
    }

    /**
     * The caching configuration associated with this rule.
     * 
     */
    @Import(name="cacheConfiguration")
    private @Nullable Output<CacheConfigurationArgs> cacheConfiguration;

    /**
     * @return The caching configuration associated with this rule.
     * 
     */
    public Optional<Output<CacheConfigurationArgs>> cacheConfiguration() {
        return Optional.ofNullable(this.cacheConfiguration);
    }

    /**
     * A custom path used to rewrite resource paths matched by this rule. Leave empty to use incoming path.
     * 
     */
    @Import(name="customForwardingPath")
    private @Nullable Output<String> customForwardingPath;

    /**
     * @return A custom path used to rewrite resource paths matched by this rule. Leave empty to use incoming path.
     * 
     */
    public Optional<Output<String>> customForwardingPath() {
        return Optional.ofNullable(this.customForwardingPath);
    }

    /**
     * Protocol this rule will use when forwarding traffic to backends.
     * 
     */
    @Import(name="forwardingProtocol")
    private @Nullable Output<Either<String,FrontDoorForwardingProtocol>> forwardingProtocol;

    /**
     * @return Protocol this rule will use when forwarding traffic to backends.
     * 
     */
    public Optional<Output<Either<String,FrontDoorForwardingProtocol>>> forwardingProtocol() {
        return Optional.ofNullable(this.forwardingProtocol);
    }

    /**
     * Expected value is &#39;#Microsoft.Azure.FrontDoor.Models.FrontdoorForwardingConfiguration&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private Output<String> odataType;

    /**
     * @return
     * Expected value is &#39;#Microsoft.Azure.FrontDoor.Models.FrontdoorForwardingConfiguration&#39;.
     * 
     */
    public Output<String> odataType() {
        return this.odataType;
    }

    private ForwardingConfigurationArgs() {}

    private ForwardingConfigurationArgs(ForwardingConfigurationArgs $) {
        this.backendPool = $.backendPool;
        this.cacheConfiguration = $.cacheConfiguration;
        this.customForwardingPath = $.customForwardingPath;
        this.forwardingProtocol = $.forwardingProtocol;
        this.odataType = $.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ForwardingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ForwardingConfigurationArgs $;

        public Builder() {
            $ = new ForwardingConfigurationArgs();
        }

        public Builder(ForwardingConfigurationArgs defaults) {
            $ = new ForwardingConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendPool A reference to the BackendPool which this rule routes to.
         * 
         * @return builder
         * 
         */
        public Builder backendPool(@Nullable Output<SubResourceArgs> backendPool) {
            $.backendPool = backendPool;
            return this;
        }

        /**
         * @param backendPool A reference to the BackendPool which this rule routes to.
         * 
         * @return builder
         * 
         */
        public Builder backendPool(SubResourceArgs backendPool) {
            return backendPool(Output.of(backendPool));
        }

        /**
         * @param cacheConfiguration The caching configuration associated with this rule.
         * 
         * @return builder
         * 
         */
        public Builder cacheConfiguration(@Nullable Output<CacheConfigurationArgs> cacheConfiguration) {
            $.cacheConfiguration = cacheConfiguration;
            return this;
        }

        /**
         * @param cacheConfiguration The caching configuration associated with this rule.
         * 
         * @return builder
         * 
         */
        public Builder cacheConfiguration(CacheConfigurationArgs cacheConfiguration) {
            return cacheConfiguration(Output.of(cacheConfiguration));
        }

        /**
         * @param customForwardingPath A custom path used to rewrite resource paths matched by this rule. Leave empty to use incoming path.
         * 
         * @return builder
         * 
         */
        public Builder customForwardingPath(@Nullable Output<String> customForwardingPath) {
            $.customForwardingPath = customForwardingPath;
            return this;
        }

        /**
         * @param customForwardingPath A custom path used to rewrite resource paths matched by this rule. Leave empty to use incoming path.
         * 
         * @return builder
         * 
         */
        public Builder customForwardingPath(String customForwardingPath) {
            return customForwardingPath(Output.of(customForwardingPath));
        }

        /**
         * @param forwardingProtocol Protocol this rule will use when forwarding traffic to backends.
         * 
         * @return builder
         * 
         */
        public Builder forwardingProtocol(@Nullable Output<Either<String,FrontDoorForwardingProtocol>> forwardingProtocol) {
            $.forwardingProtocol = forwardingProtocol;
            return this;
        }

        /**
         * @param forwardingProtocol Protocol this rule will use when forwarding traffic to backends.
         * 
         * @return builder
         * 
         */
        public Builder forwardingProtocol(Either<String,FrontDoorForwardingProtocol> forwardingProtocol) {
            return forwardingProtocol(Output.of(forwardingProtocol));
        }

        /**
         * @param forwardingProtocol Protocol this rule will use when forwarding traffic to backends.
         * 
         * @return builder
         * 
         */
        public Builder forwardingProtocol(String forwardingProtocol) {
            return forwardingProtocol(Either.ofLeft(forwardingProtocol));
        }

        /**
         * @param forwardingProtocol Protocol this rule will use when forwarding traffic to backends.
         * 
         * @return builder
         * 
         */
        public Builder forwardingProtocol(FrontDoorForwardingProtocol forwardingProtocol) {
            return forwardingProtocol(Either.ofRight(forwardingProtocol));
        }

        /**
         * @param odataType
         * Expected value is &#39;#Microsoft.Azure.FrontDoor.Models.FrontdoorForwardingConfiguration&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(Output<String> odataType) {
            $.odataType = odataType;
            return this;
        }

        /**
         * @param odataType
         * Expected value is &#39;#Microsoft.Azure.FrontDoor.Models.FrontdoorForwardingConfiguration&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        public ForwardingConfigurationArgs build() {
            $.odataType = Codegen.stringProp("odataType").output().arg($.odataType).require();
            return $;
        }
    }

}
