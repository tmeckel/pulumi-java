// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The bucket's website configuration, controlling how the service behaves when accessing bucket contents as a web site. See the Static Website Examples for more information.
 * 
 */
public final class BucketWebsiteArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketWebsiteArgs Empty = new BucketWebsiteArgs();

    /**
     * If the requested object path is missing, the service will ensure the path has a trailing '/', append this suffix, and attempt to retrieve the resulting object. This allows the creation of index.html objects to represent directory pages.
     * 
     */
    @InputImport(name="mainPageSuffix")
    private final @Nullable Input<String> mainPageSuffix;

    public Input<String> getMainPageSuffix() {
        return this.mainPageSuffix == null ? Input.empty() : this.mainPageSuffix;
    }

    /**
     * If the requested object path is missing, and any mainPageSuffix object is missing, if applicable, the service will return the named object from this bucket as the content for a 404 Not Found result.
     * 
     */
    @InputImport(name="notFoundPage")
    private final @Nullable Input<String> notFoundPage;

    public Input<String> getNotFoundPage() {
        return this.notFoundPage == null ? Input.empty() : this.notFoundPage;
    }

    public BucketWebsiteArgs(
        @Nullable Input<String> mainPageSuffix,
        @Nullable Input<String> notFoundPage) {
        this.mainPageSuffix = mainPageSuffix;
        this.notFoundPage = notFoundPage;
    }

    private BucketWebsiteArgs() {
        this.mainPageSuffix = Input.empty();
        this.notFoundPage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketWebsiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> mainPageSuffix;
        private @Nullable Input<String> notFoundPage;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketWebsiteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mainPageSuffix = defaults.mainPageSuffix;
    	      this.notFoundPage = defaults.notFoundPage;
        }

        public Builder setMainPageSuffix(@Nullable Input<String> mainPageSuffix) {
            this.mainPageSuffix = mainPageSuffix;
            return this;
        }

        public Builder setMainPageSuffix(@Nullable String mainPageSuffix) {
            this.mainPageSuffix = Input.ofNullable(mainPageSuffix);
            return this;
        }

        public Builder setNotFoundPage(@Nullable Input<String> notFoundPage) {
            this.notFoundPage = notFoundPage;
            return this;
        }

        public Builder setNotFoundPage(@Nullable String notFoundPage) {
            this.notFoundPage = Input.ofNullable(notFoundPage);
            return this;
        }

        public BucketWebsiteArgs build() {
            return new BucketWebsiteArgs(mainPageSuffix, notFoundPage);
        }
    }
}
