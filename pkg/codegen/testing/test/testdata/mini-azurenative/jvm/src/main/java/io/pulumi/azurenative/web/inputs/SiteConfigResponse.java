// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration of an App Service app.
 * 
 */
public final class SiteConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final SiteConfigResponse Empty = new SiteConfigResponse();

    /**
     * .NET Framework version.
     * 
     */
    @InputImport(name="netFrameworkVersion")
      private final @Nullable String netFrameworkVersion;

    public Optional<String> getNetFrameworkVersion() {
        return this.netFrameworkVersion == null ? Optional.empty() : Optional.ofNullable(this.netFrameworkVersion);
    }

    public SiteConfigResponse(@Nullable String netFrameworkVersion) {
        this.netFrameworkVersion = netFrameworkVersion == null ? "v4.6" : netFrameworkVersion;
    }

    private SiteConfigResponse() {
        this.netFrameworkVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SiteConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String netFrameworkVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(SiteConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.netFrameworkVersion = defaults.netFrameworkVersion;
        }

        public Builder netFrameworkVersion(@Nullable String netFrameworkVersion) {
            this.netFrameworkVersion = netFrameworkVersion;
            return this;
        }
        public SiteConfigResponse build() {
            return new SiteConfigResponse(netFrameworkVersion);
        }
    }
}
