// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.enums.DestinationProtocol;
import io.pulumi.azurenative.cdn.enums.RedirectType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the parameters for the url redirect action.
 * 
 */
public final class UrlRedirectActionParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final UrlRedirectActionParametersArgs Empty = new UrlRedirectActionParametersArgs();

    /**
     * Fragment to add to the redirect URL. Fragment is the part of the URL that comes after #. Do not include the #.
     * 
     */
    @InputImport(name="customFragment")
      private final @Nullable Input<String> customFragment;

    public Input<String> getCustomFragment() {
        return this.customFragment == null ? Input.empty() : this.customFragment;
    }

    /**
     * Host to redirect. Leave empty to use the incoming host as the destination host.
     * 
     */
    @InputImport(name="customHostname")
      private final @Nullable Input<String> customHostname;

    public Input<String> getCustomHostname() {
        return this.customHostname == null ? Input.empty() : this.customHostname;
    }

    /**
     * The full path to redirect. Path cannot be empty and must start with /. Leave empty to use the incoming path as destination path.
     * 
     */
    @InputImport(name="customPath")
      private final @Nullable Input<String> customPath;

    public Input<String> getCustomPath() {
        return this.customPath == null ? Input.empty() : this.customPath;
    }

    /**
     * The set of query strings to be placed in the redirect URL. Setting this value would replace any existing query string; leave empty to preserve the incoming query string. Query string must be in <key>=<value> format. ? and & will be added automatically so do not include them.
     * 
     */
    @InputImport(name="customQueryString")
      private final @Nullable Input<String> customQueryString;

    public Input<String> getCustomQueryString() {
        return this.customQueryString == null ? Input.empty() : this.customQueryString;
    }

    /**
     * Protocol to use for the redirect. The default value is MatchRequest
     * 
     */
    @InputImport(name="destinationProtocol")
      private final @Nullable Input<Either<String,DestinationProtocol>> destinationProtocol;

    public Input<Either<String,DestinationProtocol>> getDestinationProtocol() {
        return this.destinationProtocol == null ? Input.empty() : this.destinationProtocol;
    }

    @InputImport(name="odataType", required=true)
      private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    /**
     * The redirect type the rule will use when redirecting traffic.
     * 
     */
    @InputImport(name="redirectType", required=true)
      private final Input<Either<String,RedirectType>> redirectType;

    public Input<Either<String,RedirectType>> getRedirectType() {
        return this.redirectType;
    }

    public UrlRedirectActionParametersArgs(
        @Nullable Input<String> customFragment,
        @Nullable Input<String> customHostname,
        @Nullable Input<String> customPath,
        @Nullable Input<String> customQueryString,
        @Nullable Input<Either<String,DestinationProtocol>> destinationProtocol,
        Input<String> odataType,
        Input<Either<String,RedirectType>> redirectType) {
        this.customFragment = customFragment;
        this.customHostname = customHostname;
        this.customPath = customPath;
        this.customQueryString = customQueryString;
        this.destinationProtocol = destinationProtocol;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.redirectType = Objects.requireNonNull(redirectType, "expected parameter 'redirectType' to be non-null");
    }

    private UrlRedirectActionParametersArgs() {
        this.customFragment = Input.empty();
        this.customHostname = Input.empty();
        this.customPath = Input.empty();
        this.customQueryString = Input.empty();
        this.destinationProtocol = Input.empty();
        this.odataType = Input.empty();
        this.redirectType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlRedirectActionParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> customFragment;
        private @Nullable Input<String> customHostname;
        private @Nullable Input<String> customPath;
        private @Nullable Input<String> customQueryString;
        private @Nullable Input<Either<String,DestinationProtocol>> destinationProtocol;
        private Input<String> odataType;
        private Input<Either<String,RedirectType>> redirectType;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlRedirectActionParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customFragment = defaults.customFragment;
    	      this.customHostname = defaults.customHostname;
    	      this.customPath = defaults.customPath;
    	      this.customQueryString = defaults.customQueryString;
    	      this.destinationProtocol = defaults.destinationProtocol;
    	      this.odataType = defaults.odataType;
    	      this.redirectType = defaults.redirectType;
        }

        public Builder customFragment(@Nullable Input<String> customFragment) {
            this.customFragment = customFragment;
            return this;
        }

        public Builder customFragment(@Nullable String customFragment) {
            this.customFragment = Input.ofNullable(customFragment);
            return this;
        }

        public Builder customHostname(@Nullable Input<String> customHostname) {
            this.customHostname = customHostname;
            return this;
        }

        public Builder customHostname(@Nullable String customHostname) {
            this.customHostname = Input.ofNullable(customHostname);
            return this;
        }

        public Builder customPath(@Nullable Input<String> customPath) {
            this.customPath = customPath;
            return this;
        }

        public Builder customPath(@Nullable String customPath) {
            this.customPath = Input.ofNullable(customPath);
            return this;
        }

        public Builder customQueryString(@Nullable Input<String> customQueryString) {
            this.customQueryString = customQueryString;
            return this;
        }

        public Builder customQueryString(@Nullable String customQueryString) {
            this.customQueryString = Input.ofNullable(customQueryString);
            return this;
        }

        public Builder destinationProtocol(@Nullable Input<Either<String,DestinationProtocol>> destinationProtocol) {
            this.destinationProtocol = destinationProtocol;
            return this;
        }

        public Builder destinationProtocol(@Nullable Either<String,DestinationProtocol> destinationProtocol) {
            this.destinationProtocol = Input.ofNullable(destinationProtocol);
            return this;
        }

        public Builder odataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder odataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }

        public Builder redirectType(Input<Either<String,RedirectType>> redirectType) {
            this.redirectType = Objects.requireNonNull(redirectType);
            return this;
        }

        public Builder redirectType(Either<String,RedirectType> redirectType) {
            this.redirectType = Input.of(Objects.requireNonNull(redirectType));
            return this;
        }
        public UrlRedirectActionParametersArgs build() {
            return new UrlRedirectActionParametersArgs(customFragment, customHostname, customPath, customQueryString, destinationProtocol, odataType, redirectType);
        }
    }
}
