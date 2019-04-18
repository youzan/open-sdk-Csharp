//
//  DemoTableViewController.m
//  YZNativeDemo
//
//  Created by vee on 2017/3/1.
//  Copyright © 2017年 kele. All rights reserved.
//

#import "DemoTableViewController.h"
#import <Unsuggest/UnsuggestMethod.h>
#import <YZNativeSDK/YZNativeSDK.h>
#import <YZBaseSDK/YZBaseSDk.h>

@interface DemoTableViewController ()<YZNLoginDelegate>

@property (nonatomic, copy) NSString *rootURLPath;

@end

@implementation DemoTableViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    
    [YZSDK logout];
    [YZSDK setUpWithClientId:YourUserAgent];
    _rootURLPath = @"https://h5.koudaitong.com/v2/showcase/homepage?alias=juhos0";
    [UnsuggestMethod loginWithOutUserStateCompletionBlock:^(NSDictionary *resultInfo) {
        if (resultInfo) {
            [YZSDK setToken:resultInfo[@"data"][@"access_token"] key:nil value:nil];
        }
    }];
}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}



- (void)receiveLoginRequestFrom:(YZNViewManager *)manager
{
    [UnsuggestMethod loginWithOpenUid:@"123456" completionBlock:^(NSDictionary *resultInfo) {
        if (resultInfo) {
            [YZSDK setToken:resultInfo[@"data"][@"access_token"] key:resultInfo[@"data"][@"cookie_key"] value:resultInfo[@"data"][@"cookie_value"]];
            dispatch_async(dispatch_get_main_queue(), ^{
                [manager userDidLogin:YES];
            });
        }
    }];
}

#pragma mark - 
- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath
{
    if (indexPath.row == 0) {
        
        UIViewController *vc = [[YZNViewManager alloc] viewControllerForUrl:[NSURL URLWithString:_rootURLPath]];
        [self.navigationController pushViewController:vc animated:YES];
    }
}




@end
